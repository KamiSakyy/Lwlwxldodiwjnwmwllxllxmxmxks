package androidx.lifecycle;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class k0 {

    /* renamed from: r, reason: collision with root package name */
    public q0 f2884r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2885s;

    /* renamed from: t, reason: collision with root package name */
    public int f2886t = -1;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l0 f2887u;

    public k0(l0 l0Var, q0 q0Var) {
        this.f2887u = l0Var;
        this.f2884r = q0Var;
    }

    public final void a(boolean z10) {
        if (z10 == this.f2885s) {
            return;
        }
        this.f2885s = z10;
        int i = z10 ? 1 : -1;
        l0 l0Var = this.f2887u;
        int i10 = l0Var.f2892c;
        l0Var.f2892c = i + i10;
        if (!l0Var.f2893d) {
            l0Var.f2893d = true;
            while (true) {
                try {
                    int i11 = l0Var.f2892c;
                    if (i10 == i11) {
                        break;
                    }
                    boolean z11 = i10 == 0 && i11 > 0;
                    boolean z12 = i10 > 0 && i11 == 0;
                    if (z11) {
                        l0Var.g();
                    } else if (z12) {
                        l0Var.h();
                    }
                    i10 = i11;
                } catch (Throwable th) {
                    l0Var.f2893d = false;
                    throw th;
                }
            }
            l0Var.f2893d = false;
        }
        if (this.f2885s) {
            l0Var.c(this);
        }
    }

    public void b() {
    }

    public boolean c(c0 c0Var) {
        return false;
    }

    public abstract boolean d();

}
