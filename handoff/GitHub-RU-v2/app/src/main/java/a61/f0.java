package a61;

import android.os.Build;
import android.view.View;
import java.util.Collection;
import java.util.concurrent.CancellationException;
import v71.q1;
import w2.y1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f0 implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ f0(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    public final Object c(Object obj, a71.c cVar) {
        switch (this.r) {
            case 0:
                ((o0) this.s).c.set((v) obj);
                break;
            case 1:
                b1.m mVar = (b1.m) this.s;
                if (Build.VERSION.SDK_INT >= 34) {
                    b1.d.b(mVar.y(), (View) mVar.s);
                }
                break;
            case 2:
                Object c = ((com.apollographql.apollo.internal.c) this.s).c(obj, cVar);
                if (c != b71.a.r) {
                    break;
                }
                break;
            case 3:
                int intValue = ((Number) obj).intValue();
                go0.z zVar = (go0.z) this.s;
                if (intValue == 0 && ((Number) zVar.B.h().getValue()).intValue() == 0) {
                    g91.f fVar = zVar.A;
                    zVar.A = null;
                    if (fVar != null) {
                        fVar.b((String) null, 1000);
                    }
                    q1 q1Var = zVar.C;
                    if (q1Var != null) {
                        q1Var.m((CancellationException) null);
                    }
                }
                break;
            case 4:
                int intValue2 = ((Number) obj).intValue();
                go0.z zVar2 = (go0.z) this.s;
                if (intValue2 == 0 && ((Number) zVar2.B.h().getValue()).intValue() == 0) {
                    g91.f fVar2 = zVar2.A;
                    zVar2.A = null;
                    if (fVar2 != null) {
                        fVar2.b((String) null, 1000);
                    }
                    q1 q1Var2 = zVar2.C;
                    if (q1Var2 != null) {
                        q1Var2.m((CancellationException) null);
                    }
                }
                break;
            case 5:
                int intValue3 = ((Number) obj).intValue();
                go0.z zVar3 = (go0.z) this.s;
                if (intValue3 == 0 && ((Number) zVar3.B.h().getValue()).intValue() == 0) {
                    g91.f fVar3 = zVar3.A;
                    zVar3.A = null;
                    if (fVar3 != null) {
                        fVar3.b((String) null, 1000);
                    }
                    q1 q1Var3 = zVar3.C;
                    if (q1Var3 != null) {
                        q1Var3.m((CancellationException) null);
                    }
                }
                break;
            case 6:
                n5.x xVar = (n5.x) this.s;
                if ((xVar.h.b() instanceof n5.f0) || (r3 = n5.x.f(xVar, true, cVar)) != b71.a.r) {
                    break;
                }
                break;
            case 7:
                int intValue4 = ((Number) obj).intValue();
                go0.z zVar4 = (go0.z) this.s;
                if (intValue4 == 0 && ((Number) zVar4.B.h().getValue()).intValue() == 0) {
                    g91.f fVar4 = zVar4.A;
                    zVar4.A = null;
                    if (fVar4 != null) {
                        fVar4.b((String) null, 1000);
                    }
                    q1 q1Var4 = zVar4.C;
                    if (q1Var4 != null) {
                        q1Var4.m((CancellationException) null);
                    }
                }
                break;
            case 8:
                ((y1) this.s).r.E(((Number) obj).floatValue());
                break;
            default:
                ((Collection) this.s).add(obj);
                break;
        }
        return w61.a0.a;
    }







}
