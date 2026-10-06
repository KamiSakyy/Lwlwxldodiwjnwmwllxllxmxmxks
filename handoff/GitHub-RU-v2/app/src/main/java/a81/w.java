package a81;

/* loaded from: /home/user/work/p/classes5.dex */
public final class w implements a71.g {
    public ThreadLocal r;

    public w(ThreadLocal threadLocal) {
        this.r = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && k71.k.b(this.r, ((w) obj).r);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.r + ')';
    }
}
