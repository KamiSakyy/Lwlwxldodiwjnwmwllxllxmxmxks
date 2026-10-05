package um;

import com.github.domain.shortcuts.model.StoredShortcutModel;
import java.util.ArrayList;
import java.util.List;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;
    public final /* synthetic */ r t;

    public /* synthetic */ h(y71.j jVar, r rVar, int i) {
        this.r = i;
        this.s = jVar;
        this.t = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        g gVar;
        int i;
        i iVar;
        int i2;
        k kVar;
        int i3;
        switch (this.r) {
            case 0:
                if (cVar instanceof g) {
                    gVar = (g) cVar;
                    int i4 = gVar.v;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        gVar.v = i4 - Integer.MIN_VALUE;
                        Object obj2 = gVar.u;
                        b71.a aVar = b71.a.r;
                        i = gVar.v;
                        if (i != 0) {
                            y.j(obj2);
                            this.t.c.getClass();
                            StoredShortcutModel d = vm.b.d((ek.e) obj);
                            gVar.v = 1;
                            if (this.s.c(d, gVar) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj2);
                        }
                        return a0.a;
                    }
                }
                gVar = new g(this, cVar);
                Object obj22 = gVar.u;
                b71.a aVar2 = b71.a.r;
                i = gVar.v;
                if (i != 0) {
                }
                return a0.a;
            case 1:
                if (cVar instanceof i) {
                    iVar = (i) cVar;
                    int i5 = iVar.v;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        iVar.v = i5 - Integer.MIN_VALUE;
                        Object obj3 = iVar.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = iVar.v;
                        if (i2 != 0) {
                            y.j(obj3);
                            r rVar = this.t;
                            rVar.c.getClass();
                            ArrayList a = r.a(rVar, vm.b.e((List) obj));
                            iVar.v = 1;
                            if (this.s.c(a, iVar) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj3);
                        }
                        return a0.a;
                    }
                }
                iVar = new i(this, cVar);
                Object obj32 = iVar.u;
                b71.a aVar32 = b71.a.r;
                i2 = iVar.v;
                if (i2 != 0) {
                }
                return a0.a;
            default:
                if (cVar instanceof k) {
                    kVar = (k) cVar;
                    int i6 = kVar.v;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        kVar.v = i6 - Integer.MIN_VALUE;
                        Object obj4 = kVar.u;
                        b71.a aVar4 = b71.a.r;
                        i3 = kVar.v;
                        if (i3 != 0) {
                            y.j(obj4);
                            this.t.c.getClass();
                            ArrayList e = vm.b.e((List) obj);
                            kVar.v = 1;
                            if (this.s.c(e, kVar) == aVar4) {
                                return aVar4;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj4);
                        }
                        return a0.a;
                    }
                }
                kVar = new k(this, cVar);
                Object obj42 = kVar.u;
                b71.a aVar42 = b71.a.r;
                i3 = kVar.v;
                if (i3 != 0) {
                }
                return a0.a;
        }
    }
}
