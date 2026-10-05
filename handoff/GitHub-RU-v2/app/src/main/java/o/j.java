package o;

import a5.m1;
import com.google.android.gms.internal.measurement.z3;
import q.i3;

/* loaded from: /home/user/work/p/classes.dex */
public final class j extends z3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29771b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f29772c;

    /* renamed from: d, reason: collision with root package name */
    public int f29773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f29774e;

    public j(k kVar) {
        this.f29771b = 0;
        this.f29774e = kVar;
        this.f29772c = false;
        this.f29773d = 0;
    }

    public void a() {
        switch (this.f29771b) {
            case 1:
                this.f29772c = true;
                break;
        }
    }

    public final void b() {
        switch (this.f29771b) {
            case k5.f.J:
                if (!this.f29772c) {
                    this.f29772c = true;
                    m1 m1Var = ((k) this.f29774e).f29778d;
                    if (m1Var != null) {
                        m1Var.b();
                        break;
                    }
                }
                break;
            default:
                ((i3) this.f29774e).f30611a.setVisibility(0);
                break;
        }
    }

    public final void c() {
        switch (this.f29771b) {
            case k5.f.J:
                int i = this.f29773d + 1;
                this.f29773d = i;
                k kVar = (k) this.f29774e;
                if (i == kVar.f29775a.size()) {
                    m1 m1Var = kVar.f29778d;
                    if (m1Var != null) {
                        m1Var.c();
                    }
                    this.f29773d = 0;
                    this.f29772c = false;
                    kVar.f29779e = false;
                    break;
                }
                break;
            default:
                if (!this.f29772c) {
                    ((i3) this.f29774e).f30611a.setVisibility(this.f29773d);
                    break;
                }
                break;
        }
    }

    public j(i3 i3Var, int i) {
        this.f29771b = 1;
        this.f29774e = i3Var;
        this.f29773d = i;
        this.f29772c = false;
    }

}
