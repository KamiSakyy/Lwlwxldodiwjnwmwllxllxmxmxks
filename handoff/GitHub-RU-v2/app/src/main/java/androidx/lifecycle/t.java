package androidx.lifecycle;

/* loaded from: /home/user/work/p/classes.dex */
public final class t {
    public static v a(w wVar) {
        k71.k.g(wVar, "state");
        int ordinal = wVar.ordinal();
        if (ordinal == 2) {
            return v.ON_DESTROY;
        }
        if (ordinal == 3) {
            return v.ON_STOP;
        }
        if (ordinal != 4) {
            return null;
        }
        return v.ON_PAUSE;
    }
}
