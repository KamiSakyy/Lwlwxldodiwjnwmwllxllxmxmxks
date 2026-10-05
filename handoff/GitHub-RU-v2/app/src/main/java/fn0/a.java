package fn0;

import e11.b;
import kc0.yb0;
import sy.c0;
import u10.y90;
import y41.t1;
import y71.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements e11.a, yb0, y90, yn.a {
    public final /* synthetic */ int r;

    @Override // e11.a
    public final Object a(int i, byte[] bArr) {
        switch (this.r) {
            case 0:
                return t1.S("approveMobileAuth", "3.12");
            case 1:
                return t1.S("approveMobileAuth", "3.10");
            default:
                return c0.j();
        }
    }

    @Override // e11.a
    public final Object b(String str, b bVar, String str2, boolean z) {
        switch (this.r) {
            case 0:
                return t1.S("addRecoveryPublicKey", "3.12");
            case 1:
                return t1.S("addRecoveryPublicKey", "3.10");
            default:
                return c0.j();
        }
    }

    @Override // e11.a
    public final Object c(String str, b bVar, String str2, boolean z) {
        switch (this.r) {
            case 0:
                return t1.S("addAuthPublicKey", "3.12");
            case 1:
                return t1.S("addAuthPublicKey", "3.10");
            default:
                return c0.j();
        }
    }

    @Override // e11.a
    public final i d() {
        switch (this.r) {
            case 0:
                return t1.S("fetchMobileAuthRequest", "3.12");
            case 1:
                return t1.S("fetchMobileAuthRequest", "3.10");
            default:
                return c0.j();
        }
    }

    @Override // e11.a
    public final Object e() {
        switch (this.r) {
            case 0:
                return t1.S("deleteAuthPublicKey", "3.12");
            case 1:
                return t1.S("deleteAuthPublicKey", "3.10");
            default:
                return c0.j();
        }
    }

    @Override // e11.a
    public final Object f() {
        switch (this.r) {
            case 0:
                return t1.S("fetchMobileAuthRequest", "3.12");
            case 1:
                return t1.S("fetchMobileAuthRequest", "3.10");
            default:
                return c0.j();
        }
    }

    @Override // e11.a
    public final Object g(int i) {
        switch (this.r) {
            case 0:
                return t1.S("rejectMobileAuth", "3.12");
            case 1:
                return t1.S("rejectMobileAuth", "3.10");
            default:
                return c0.j();
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
