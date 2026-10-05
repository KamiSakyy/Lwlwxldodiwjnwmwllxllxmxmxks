package yg;

import com.github.rudroid.fileschanged.ui.l0;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class p implements j71.e {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ Object s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ j71.a v;
    public final /* synthetic */ w1.r w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    public /* synthetic */ p(String str, boolean z, j71.a aVar, String str2, w1.r rVar, int i, int i2, int i3) {
        this.s = str;
        this.t = z;
        this.v = aVar;
        this.u = str2;
        this.w = rVar;
        this.x = i;
        this.y = i2;
        this.z = i3;
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                String str = (String) this.s;
                String str2 = (String) this.u;
                ((Integer) obj2).getClass();
                int L = androidx.compose.runtime.t.L(this.y | 1);
                q.d(this.x, L, this.z, (androidx.compose.runtime.s) obj, this.v, str, str2, this.w, this.t);
                break;
            case 1:
                String str3 = (String) this.s;
                String str4 = (String) this.u;
                ((Integer) obj2).getClass();
                int L2 = androidx.compose.runtime.t.L(this.y | 1);
                q.c(this.x, L2, this.z, (androidx.compose.runtime.s) obj, this.v, str3, str4, this.w, this.t);
                break;
            default:
                ((Integer) obj2).getClass();
                l0.a(this.w, this.t, this.x, this.v, (j71.a) this.s, (j71.a) this.u, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(this.y | 1), this.z);
                break;
        }
        return a0.a;
    }

    public /* synthetic */ p(String str, boolean z, String str2, j71.a aVar, w1.r rVar, int i, int i2, int i3) {
        this.s = str;
        this.t = z;
        this.u = str2;
        this.v = aVar;
        this.w = rVar;
        this.x = i;
        this.y = i2;
        this.z = i3;
    }

    public /* synthetic */ p(w1.r rVar, boolean z, int i, j71.a aVar, j71.a aVar2, j71.a aVar3, int i2, int i3) {
        this.w = rVar;
        this.t = z;
        this.x = i;
        this.v = aVar;
        this.s = aVar2;
        this.u = aVar3;
        this.y = i2;
        this.z = i3;
    }
}
