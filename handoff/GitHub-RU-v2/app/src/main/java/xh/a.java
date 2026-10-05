package xh;

import androidx.compose.runtime.s;
import com.github.rudroid.activities.p2;
import com.github.rudroid.views.refreshableviews.SwipeRefreshUiStateRecyclerView;
import j71.e;
import r1.i;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class a implements e {
    public final /* synthetic */ int r;
    public final /* synthetic */ p2 s;
    public final /* synthetic */ fl.b t;

    public /* synthetic */ a(p2 p2Var, fl.b bVar, int i) {
        this.r = i;
        this.s = p2Var;
        this.t = bVar;
    }

    public final Object s(Object obj, Object obj2) {
        int i = this.r;
        a0 a0Var = a0.a;
        fl.b bVar = this.t;
        p2 p2Var = this.s;
        int i2 = 1;
        switch (i) {
            case 0:
                s sVar = (s) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = SwipeRefreshUiStateRecyclerView.o0;
                if (!sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    sVar.V();
                    break;
                } else {
                    ih.e.a(false, null, null, null, null, null, null, null, null, i.d(1349601262, new a(p2Var, bVar, i2), sVar), sVar, 805306368, 511);
                    break;
                }
            default:
                s sVar2 = (s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i4 = SwipeRefreshUiStateRecyclerView.o0;
                if (!sVar2.S(1 & intValue2, (intValue2 & 3) != 2)) {
                    sVar2.V();
                    break;
                } else {
                    p2Var.g(bVar, sVar2, 0);
                    break;
                }
        }
        return a0Var;
    }
}
