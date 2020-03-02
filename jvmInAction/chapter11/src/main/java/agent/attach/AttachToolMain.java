package agent.attach;


import com.sun.tools.attach.*;

import java.io.IOException;
import java.util.List;

public class AttachToolMain {
    /**
     * 将Java agent附加到指定的java程序中
     * @param args
     * @throws AttachNotSupportedException
     * @throws IOException
     * @throws AgentLoadException
     * @throws AgentInitializationException
     */
    public static void main(String[] args) throws AttachNotSupportedException, IOException, AgentLoadException, AgentInitializationException {
        List<VirtualMachineDescriptor> list = VirtualMachine.list();
        for(VirtualMachineDescriptor vmd: list){
            if(vmd.displayName().endsWith("RunLoopAccountMain")){
                VirtualMachine virtualMachine = VirtualMachine.attach(vmd.id());
                virtualMachine.loadAgent("/Users/dengxiaojun/Downloads/agent.jar","argument");
                System.out.println("ok");
//                virtualMachine.detach();
            }
        }
    }
}
