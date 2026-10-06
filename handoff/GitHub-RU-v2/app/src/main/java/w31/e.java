package w31;

import a5.p2;
import a5.z;
import android.view.View;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e implements z {
    public final /* synthetic */ i r;

    public void a(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.r.b(0);
    }

    public p2 l(View view, p2 p2Var) {
        int a = p2Var.a();
        i iVar = this.r;
        iVar.o = a;
        iVar.p = p2Var.b();
        iVar.q = p2Var.c();
        iVar.j();
        return p2Var;
    }


    public e(Object... a) {
    }
    public Object b(Object) { return null; }
}
