package da1;

/* loaded from: /home/user/work/p/classes5.dex */
public final class m0 extends s0 {
    public b1.m d;
    public String e;
    public b1.m f;
    public b1.m g;
    public boolean h;

    public m0() {
        super(1);
        this.d = new b1.m(28);
        this.e = null;
        this.f = new b1.m(28);
        this.g = new b1.m(28);
        this.h = false;
    }

    @Override // da1.s0
    public final void f() {
        this.b = -1;
        this.c = -1;
        this.d.D();
        this.e = null;
        this.f.D();
        this.g.D();
        this.h = false;
    }

    public final String toString() {
        return "<!doctype " + this.d.G() + ">";
    }
}
