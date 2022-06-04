package hello.advanced.trace.hellotrace;


import hello.advanced.trace.TraceStatus;

public interface HelloTrace {
    public TraceStatus begin(String message);
    public void end(TraceStatus status);
    public void exception(TraceStatus status, Exception e);
}
