package com.adobe.aem.guides.demo.core.workflows;

import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.granite.workflow.WorkflowException;
import com.adobe.granite.workflow.WorkflowSession;
import com.adobe.granite.workflow.exec.WorkItem;
import com.adobe.granite.workflow.exec.WorkflowProcess;
import com.adobe.granite.workflow.metadata.MetaDataMap;

@Component(service =WorkflowProcess.class,immediate = true,enabled = true, property = {"process.label="+"TestDigital242024"} )
public class TestDigital implements WorkflowProcess {

    private static final Logger LOG=LoggerFactory.getLogger(TestDigital.class);

    @Override
    public void execute(WorkItem workItem, WorkflowSession wSession, MetaDataMap mDataMap) throws WorkflowException {
             //Getting the payload from the WorkFlow-->WorkItem-->WorkFlowData--payLoad
        String payloadType=workItem.getWorkflowData().getPayloadType();
           //we are the checking the payLoad
        if(payloadType.equals("JCR_PATH"))
        {
            LOG.info("payLoadType {}",payloadType);
             //we are gettin path from the payload
           String path=workItem.getWorkflowData().getPayload().toString();

           LOG.info("path {}",path);


        }


        
        
    }

}
