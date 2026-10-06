package c71;

/* loaded from: /home/user/work/p/classes4.dex */
public class b implements a71.c {
    public static final b r = new b();

    @Override // a71.c
    public final void i(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // a71.c
    public final a71.h q() {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
