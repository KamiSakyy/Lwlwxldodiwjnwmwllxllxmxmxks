package c00;

import java.util.List;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.i[] s;

    public /* synthetic */ n(y71.i[] iVarArr, int i) {
        this.r = i;
        this.s = iVarArr;
    }

    public final Object a() {
        switch (this.r) {
            case 0:
                return new a0[this.s.length];
            case 1:
                return new a0[this.s.length];
            case 2:
                return new List[this.s.length];
            case 3:
                return new List[this.s.length];
            default:
                return new z8.c[this.s.length];
        }
    }
}
