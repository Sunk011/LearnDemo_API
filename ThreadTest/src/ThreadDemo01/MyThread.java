package ThreadDemo01;

public class MyThread extends  Thread {
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(getName()+" "+i);
        }
    }
}
//
//    public Thread() {
//        this(null, null, "Thread-" + nextThreadNum(), 0);
//    }
//
//
//    private static int threadInitNumber;
//
//
//    private static synchronized int nextThreadNum() {
//        return threadInitNumber++;
//    }
//
//
//    public Thread(ThreadGroup group, Runnable target, String name,
//                  long stackSize) {
//        this(group, target, name, stackSize, null, true);
//    }
//
//
//    private volatile String name;
//
//
//     private Thread(ThreadGroup g, Runnable target, String name,
//                   long stackSize, AccessControlContext acc,
//                   boolean inheritThreadLocals) {
//        if (name == null) {
//            throw new NullPointerException("name cannot be null");
//        }
//
//        this.name = name;
//
//        Thread parent = currentThread();
//        SecurityManager security = System.getSecurityManager();
//        if (g == null) {
//            /* Determine if it's an applet or not */
//
//            /* If there is a security manager, ask the security manager
//               what to do. */
//            if (security != null) {
//                    g = security.getThreadGroup();
//                    }
//
//            /* If the security manager doesn't have a strong opinion
//               on the matter, use the parent thread group. */
//                    if (g == null) {
//                    g = parent.getThreadGroup();
//                    }
//                    }
//
//        /* checkAccess regardless of whether or not threadgroup is
//           explicitly passed in. */
//                    g.checkAccess();
//
//                    /*
//                     * Do we have the required permissions?
//                     */
//                    if (security != null) {
//                    if (isCCLOverridden(getClass())) {
//                    security.checkPermission(
//                    SecurityConstants.SUBCLASS_IMPLEMENTATION_PERMISSION);
//                    }
//                    }
//
//                    g.addUnstarted();
//
//                    this.group = g;
//                    this.daemon = parent.isDaemon();
//                    this.priority = parent.getPriority();
//                    if (security == null || isCCLOverridden(parent.getClass()))
//                    this.contextClassLoader = parent.getContextClassLoader();
//                    else
//                    this.contextClassLoader = parent.contextClassLoader;
//                    this.inheritedAccessControlContext =
//                    acc != null ? acc : AccessController.getContext();
//                    this.target = target;
//                    setPriority(priority);
//                    if (inheritThreadLocals && parent.inheritableThreadLocals != null)
//                    this.inheritableThreadLocals =
//                    ThreadLocal.createInheritedMap(parent.inheritableThreadLocals);
//                    /* Stash the specified stack size in case the VM cares */
//                    this.stackSize = stackSize;
//
//                    /* Set thread ID */
//                    this.tid = nextThreadID();
//                    }
//