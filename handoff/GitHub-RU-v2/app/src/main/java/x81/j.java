package x81;

import java.io.IOException;
import java.util.List;

/* loaded from: /home/user/work/p/classes5.dex */
public final /* synthetic */ class j implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ o s;
    public final /* synthetic */ int t;

    public /* synthetic */ j(o oVar, int i, Object obj, int i2) {
        this.r = i2;
        this.s = oVar;
        this.t = i;
    }

    public final Object a() {
        switch (this.r) {
            case 0:
                o oVar = this.s;
                int i = this.t;
                oVar.B.getClass();
                try {
                    oVar.O.F(i, a.y);
                    synchronized (oVar) {
                        oVar.Q.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return w61.a0.a;
            case 1:
                o oVar2 = this.s;
                int i2 = this.t;
                oVar2.B.getClass();
                synchronized (oVar2) {
                    oVar2.Q.remove(Integer.valueOf(i2));
                }
                return w61.a0.a;
            default:
                o oVar3 = this.s;
                int i3 = this.t;
                oVar3.B.getClass();
                try {
                    oVar3.O.F(i3, a.y);
                    synchronized (oVar3) {
                        oVar3.Q.remove(Integer.valueOf(i3));
                    }
                } catch (IOException unused2) {
                }
                return w61.a0.a;
        }
    }

    public /* synthetic */ j(o oVar, int i, List list, boolean z) {
        this.r = 2;
        this.s = oVar;
        this.t = i;
    }
}
