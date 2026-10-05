package i91;

import h91.e0;
import java.io.IOException;
import k71.w;
import w61.a0;

/* loaded from: /home/user/work/p/classes5.dex */
public final /* synthetic */ class k implements j71.e {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ w s;
    public final /* synthetic */ e0 t;
    public final /* synthetic */ w u;
    public final /* synthetic */ w v;

    public /* synthetic */ k(e0 e0Var, w wVar, w wVar2, w wVar3) {
        this.t = e0Var;
        this.s = wVar;
        this.u = wVar2;
        this.v = wVar3;
    }

    public final Object s(Object obj, Object obj2) {
        int i = this.r;
        int intValue = ((Integer) obj).intValue();
        Long l = (Long) obj2;
        switch (i) {
            case 0:
                long longValue = l.longValue();
                if (intValue == 21589) {
                    if (longValue < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    e0 e0Var = this.t;
                    byte readByte = e0Var.readByte();
                    boolean z = (readByte & 1) == 1;
                    boolean z2 = (readByte & 2) == 2;
                    boolean z3 = (readByte & 4) == 4;
                    long j = z ? 5L : 1L;
                    if (z2) {
                        j += 4;
                    }
                    if (z3) {
                        j += 4;
                    }
                    if (longValue < j) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z) {
                        this.s.r = Integer.valueOf(e0Var.m());
                    }
                    if (z2) {
                        this.u.r = Integer.valueOf(e0Var.m());
                    }
                    if (z3) {
                        this.v.r = Integer.valueOf(e0Var.m());
                    }
                }
                return a0.a;
            default:
                long longValue2 = l.longValue();
                if (intValue == 1) {
                    w wVar = this.s;
                    if (wVar.r != null) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (longValue2 != 24) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    e0 e0Var2 = this.t;
                    wVar.r = Long.valueOf(e0Var2.r());
                    this.u.r = Long.valueOf(e0Var2.r());
                    this.v.r = Long.valueOf(e0Var2.r());
                }
                return a0.a;
        }
    }

    public /* synthetic */ k(w wVar, e0 e0Var, w wVar2, w wVar3) {
        this.s = wVar;
        this.t = e0Var;
        this.u = wVar2;
        this.v = wVar3;
    }
}
