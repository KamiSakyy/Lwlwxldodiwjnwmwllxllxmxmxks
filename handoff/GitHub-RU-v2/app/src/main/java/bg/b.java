package bg;

import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import com.github.rudroid.agents.sessionevents.ui.l2;
import d1.h1;
import w1.r;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class b implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ j71.a s;
    public final /* synthetic */ r t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ int v;

    public /* synthetic */ b(j71.a aVar, r rVar, boolean z, int i) {
        this.r = 1;
        this.s = aVar;
        this.t = rVar;
        this.u = z;
        this.v = i;
    }

    public final Object s(Object obj, Object obj2) {
        int i = this.r;
        s sVar = (s) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                c.a(t.L(this.v | 1), sVar, this.s, this.t, this.u);
                break;
            case 1:
                l2.b(t.L(this.v | 1), sVar, this.s, this.t, this.u);
                break;
            default:
                h1.e(t.L(this.v | 1), sVar, this.s, this.t, this.u);
                break;
        }
        return a0.a;
    }

    public /* synthetic */ b(r rVar, j71.a aVar, int i, boolean z, int i2) {
        this.r = i2;
        this.t = rVar;
        this.s = aVar;
        this.u = z;
        this.v = i;
    }
}
