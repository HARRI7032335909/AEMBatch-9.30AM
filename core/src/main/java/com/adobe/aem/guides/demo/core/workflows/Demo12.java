package com.adobe.aem.guides.demo.core.workflows;

import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.granite.workflow.WorkflowException;
import com.adobe.granite.workflow.WorkflowSession;
import com.adobe.granite.workflow.exec.WorkItem;
import com.adobe.granite.workflow.exec.WorkflowProcess;
import com.adobe.granite.workflow.metadata.MetaDataMap;
@Component(service = WorkflowProcess.class,immediate = true,enabled = true, property = "process.label="+"Demo12241014")
public class Demo12 implements WorkflowProcess {

    private static final Logger LOG=LoggerFactory.getLogger(Demo12.class);

    @Override
    public void execute(WorkItem item, WorkflowSession session, MetaDataMap metaDataMap) throws WorkflowException {
       //Getting payload from the workflow ->WorkFlow->WorkFlowData-->payLoad
        String payloadType=item.getWorkflowData().getPayloadType();

        if(payloadType.equals("JCR_PATH"))
        {
            LOG.info("payloadType {}",payloadType);
            
            String path=item.getWorkflowData().getPayload().toString();

            LOG.info("path {}", path);
        }
        
    }

}
