package hd0;

import go0.z;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import sb.a;
import sy.y;
import v71.q1;
import w61.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b implements y71.j {
    public final /* synthetic */ z r;

    public b(z zVar) {
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
        a aVar2;
        int i;
        if (cVar instanceof a) {
            aVar2 = (a) cVar;
            int i2 = aVar2.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar2.w = i2 - Integer.MIN_VALUE;
                Object obj = aVar2.u;
                b71.a aVar3 = b71.a.r;
                i = aVar2.w;
                if (i != 0) {
                    y.j(obj);
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
                            aVar2.w = 1;
                            if (zVar.n(aVar2) == aVar3) {
                                return aVar3;
                            }
                        }
                    }
                    return a0.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y.j(obj);
                return a0.a;
            }
        }
        aVar2 = new a(this, cVar);
        Object obj2 = aVar2.u;
        b71.a aVar32 = b71.a.r;
        i = aVar2.w;
        if (i != 0) {
        }
        return a0.a;
    }
}
