package com.adobe.aem.guides.demo.core.workflows;

import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.granite.workflow.WorkflowException;
import com.adobe.granite.workflow.WorkflowSession;
import com.adobe.granite.workflow.exec.WorkItem;
import com.adobe.granite.workflow.exec.WorkflowProcess;
import com.adobe.granite.workflow.metadata.MetaDataMap;
@Component(service=WorkflowProcess.class,immediate = true,property = {"process.label=" + "Demo19082024"})
public class Demo implements WorkflowProcess {
    private static final Logger LOG_DEMO_TEST=LoggerFactory.getLogger(Demo.class);

    @Override
    public void execute(WorkItem workItem, WorkflowSession workflowSession, MetaDataMap metaDataMap) throws WorkflowException {
        // TODO Auto-generated method stub
        
        String payloadType=workItem.getWorkflowData().getPayloadType();
        if(payloadType.equals("JCR_PATH"))
        {
     
        LOG_DEMO_TEST.info("payload is {}",payloadType); 
            String path=workItem.getWorkflowData().getPayload().toString();
        LOG_DEMO_TEST.info("path is { }",path);
        }
    }

}
