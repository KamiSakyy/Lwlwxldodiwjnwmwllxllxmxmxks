package fa1;

import java.util.Objects;

/* loaded from: /home/user/work/p/classes5.dex */
public final class c0 extends x0Shadow {
    public final /* synthetic */ int d;
    public String e;
    public bShadow f;
    public boolean g;

    public c0(int i, String str, boolean z) {
        this.d = i;
        switch (i) {
            case 1:
                bShadow bVar = b.s;
                Objects.requireNonNull(str, "name == null");
                this.e = str;
                this.f = bVar;
                this.g = z;
                break;
            case 2:
                bShadow bVar2 = b.s;
                Objects.requireNonNull(str, "name == null");
                this.e = str;
                this.f = bVar2;
                this.g = z;
                break;
            default:
                bShadow bVar3 = b.s;
                Objects.requireNonNull(str, "name == null");
                this.e = str;
                this.f = bVar3;
                this.g = z;
                break;
        }
    }

    @Override // fa1.x0Shadow
    public final void a(n0 n0Var, Object obj) {
        switch (this.d) {
            case 0:
                if (obj != null) {
                    this.f.getClass();
                    String obj2 = obj.toString();
                    if (obj2 != null) {
                        n0Var.a(this.e, obj2, this.g);
                        break;
                    }
                }
                break;
            case 1:
                if (obj != null) {
                    this.f.getClass();
                    String obj3 = obj.toString();
                    if (obj3 != null) {
                        n0Var.b(this.e, obj3, this.g);
                        break;
                    }
                }
                break;
            default:
                if (obj != null) {
                    this.f.getClass();
                    String obj4 = obj.toString();
                    if (obj4 != null) {
                        n0Var.d(this.e, obj4, this.g);
                        break;
                    }
                }
                break;
        }
    }
}
