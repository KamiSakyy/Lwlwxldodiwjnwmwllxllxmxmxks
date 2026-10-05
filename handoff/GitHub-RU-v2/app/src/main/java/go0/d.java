package go0;

import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import sb.a;
import v71.q1;
import w61.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements y71.j {
    public final /* synthetic */ z r;

    public d(z zVar) {
        this.r = zVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|(1:(2:21|(2:23|(1:25)))(2:26|27))(4:28|(1:30)|31|(1:33))|12|13)|11|12|13))|35|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(a.a aVar, a71.c cVar) {
        c cVar2;
        int i;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i2 = cVar2.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar2.w = i2 - Integer.MIN_VALUE;
                Object obj = cVar2.u;
                b71.a aVar2 = b71.a.r;
                i = cVar2.w;
                if (i != 0) {
                    sy.y.j(obj);
                    int ordinal = aVar.ordinal();
                    z zVar = this.r;
                    if (ordinal == 0) {
                        g91.f fVar = zVar.A;
                        zVar.A = null;
                        if (fVar != null) {
                            fVar.b((String) null, 1000);
                        }
                        q1 q1Var = zVar.C;
                        if (q1Var != null) {
                            q1Var.m((CancellationException) null);
                        }
                    } else {
                        if (ordinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (!zVar.z.isEmpty()) {
                            cVar2.w = 1;
                            if (zVar.o(cVar2) == aVar2) {
                                return aVar2;
                            }
                        }
                    }
                    return a0.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return a0.a;
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.u;
        b71.a aVar22 = b71.a.r;
        i = cVar2.w;
        if (i != 0) {
        }
        return a0.a;
    }
}
