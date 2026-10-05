package xn;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b1 {
    public abstract v C();

    public abstract boolean E();

    public final boolean G() {
        if (this instanceof c1) {
            return ((c1) this).B;
        }
        if (this instanceof v0) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public abstract g c();

    public abstract String getId();

    public abstract String getName();

    public abstract h h();

    public abstract j j();

    public abstract boolean o();

    public abstract k r();

    public abstract boolean y();

    public abstract m z();
}
