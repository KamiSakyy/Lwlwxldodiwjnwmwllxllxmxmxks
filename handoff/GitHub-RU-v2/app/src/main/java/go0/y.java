package go0;

import a61.l0;
import com.github.rudroid.issueorpullrequest.mergebox.ui.e0;
import java.util.LinkedHashMap;
import java.util.function.BiFunction;
import t00.f8;
import w61.a0;
import y71.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y extends c71.j implements j71.e {
    public final /* synthetic */ int v;
    public /* synthetic */ boolean w;
    public final /* synthetic */ qn.g x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj, qn.g gVar, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.y = obj;
        this.x = gVar;
    }

    @Override // c71.a
    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                y yVar = new y((z) this.y, this.x, cVar, 0);
                yVar.w = ((Boolean) obj).booleanValue();
                return yVar;
            case 1:
                y yVar2 = new y((z) this.y, this.x, cVar, 1);
                yVar2.w = ((Boolean) obj).booleanValue();
                return yVar2;
            case 2:
                y yVar3 = new y((z) this.y, this.x, cVar, 2);
                yVar3.w = ((Boolean) obj).booleanValue();
                return yVar3;
            default:
                y yVar4 = new y((z) this.y, this.x, cVar, 3);
                yVar4.w = ((Boolean) obj).booleanValue();
                return yVar4;
        }
    }

    @Override // j71.e
    public final Object s(Object obj, Object obj2) {
        int i = this.v;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        a71.c cVar = (a71.c) obj2;
        switch (i) {
        }
        return ((y) r(cVar, bool)).v(a0.a);
    }

    @Override // c71.a
    public final Object v(Object obj) {
        int i = this.v;
        final int i2 = 5;
        final int i3 = 8;
        int i4 = 28;
        int i5 = 7;
        Object obj2 = this.y;
        qn.g gVar = this.x;
        final int i6 = 10;
        int i7 = 6;
        z zVar = (z) obj2;
        switch (i) {
            case 0:
                boolean z = this.w;
                b71.a aVar = b71.a.r;
                sy.y.j(obj);
                k71.k.g("- send successful? " + z, "message");
                if (!z) {
                    return new f8(new do0.m(2, null, 3));
                }
                String str = gVar.a;
                LinkedHashMap linkedHashMap = zVar.z;
                final g3.a0 a0Var = new g3.a0(25);
                final int i8 = 1;
                linkedHashMap.compute(str, new BiFunction() { // from class: go0.a
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        switch (i8) {
                            case 0:
                                return (f) a0Var.s(obj3, obj4);
                            case 1:
                                return (f) a0Var.s(obj3, obj4);
                            case 2:
                                return (f) ((b) a0Var).s(obj3, obj4);
                            case 3:
                                return (hd0.d) a0Var.s(obj3, obj4);
                            case 4:
                                return (hd0.d) ((b) a0Var).s(obj3, obj4);
                            case 5:
                                return (hd0.d) a0Var.s(obj3, obj4);
                            case 6:
                                return (kp.d) a0Var.s(obj3, obj4);
                            case 7:
                                return (kp.d) ((b) a0Var).s(obj3, obj4);
                            case 8:
                                return (kp.d) a0Var.s(obj3, obj4);
                            case 9:
                                return (r20.d) ((py0.o) a0Var).s(obj3, obj4);
                            case 10:
                                return (r20.d) ((py0.o) a0Var).s(obj3, obj4);
                            default:
                                return (r20.d) ((b) a0Var).s(obj3, obj4);
                        }
                    }
                });
                return new aq.c(new y71.y(new l0(new cn.q(new cn.q(new az0.c(new y00.l(new h1(zVar.B), 10), i5), 5), 4), gVar, i7), new an.i(zVar, gVar, (a71.c) null, 3), 6), 1);
            case 1:
                boolean z2 = this.w;
                b71.a aVar2 = b71.a.r;
                sy.y.j(obj);
                k71.k.g("- send successful? " + z2, "message");
                if (!z2) {
                    return new f8(new do0.m(2, null, 5));
                }
                String str2 = gVar.a;
                LinkedHashMap linkedHashMap2 = zVar.z;
                final g3.a0 a0Var2 = new g3.a0(28);
                linkedHashMap2.compute(str2, new BiFunction() { // from class: go0.a
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        switch (i2) {
                            case 0:
                                return (f) a0Var2.s(obj3, obj4);
                            case 1:
                                return (f) a0Var2.s(obj3, obj4);
                            case 2:
                                return (f) ((b) a0Var2).s(obj3, obj4);
                            case 3:
                                return (hd0.d) a0Var2.s(obj3, obj4);
                            case 4:
                                return (hd0.d) ((b) a0Var2).s(obj3, obj4);
                            case 5:
                                return (hd0.d) a0Var2.s(obj3, obj4);
                            case 6:
                                return (kp.d) a0Var2.s(obj3, obj4);
                            case 7:
                                return (kp.d) ((b) a0Var2).s(obj3, obj4);
                            case 8:
                                return (kp.d) a0Var2.s(obj3, obj4);
                            case 9:
                                return (r20.d) ((py0.o) a0Var2).s(obj3, obj4);
                            case 10:
                                return (r20.d) ((py0.o) a0Var2).s(obj3, obj4);
                            default:
                                return (r20.d) ((b) a0Var2).s(obj3, obj4);
                        }
                    }
                });
                return new aq.c(new y71.y(new l0(new cn.q(new cn.q(new az0.c(new y00.l(new h1(zVar.B), 10), i3), 7), 6), gVar, i5), new an.i(zVar, gVar, (a71.c) null, 4), 6), 2);
            case 2:
                boolean z3 = this.w;
                b71.a aVar3 = b71.a.r;
                sy.y.j(obj);
                k71.k.g("- send successful? " + z3, "message");
                if (!z3) {
                    return new f8(new do0.m(2, null, 6));
                }
                LinkedHashMap linkedHashMap3 = zVar.z;
                String str3 = gVar.c;
                final e0 e0Var = new e0(28, gVar);
                linkedHashMap3.compute(str3, new BiFunction() { // from class: go0.a
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        switch (i3) {
                            case 0:
                                return (f) e0Var.s(obj3, obj4);
                            case 1:
                                return (f) e0Var.s(obj3, obj4);
                            case 2:
                                return (f) ((b) e0Var).s(obj3, obj4);
                            case 3:
                                return (hd0.d) e0Var.s(obj3, obj4);
                            case 4:
                                return (hd0.d) ((b) e0Var).s(obj3, obj4);
                            case 5:
                                return (hd0.d) e0Var.s(obj3, obj4);
                            case 6:
                                return (kp.d) e0Var.s(obj3, obj4);
                            case 7:
                                return (kp.d) ((b) e0Var).s(obj3, obj4);
                            case 8:
                                return (kp.d) e0Var.s(obj3, obj4);
                            case 9:
                                return (r20.d) ((py0.o) e0Var).s(obj3, obj4);
                            case 10:
                                return (r20.d) ((py0.o) e0Var).s(obj3, obj4);
                            default:
                                return (r20.d) ((b) e0Var).s(obj3, obj4);
                        }
                    }
                });
                return new aq.c(new y71.y(new l0(new cn.q(new cn.q(new az0.c(new y00.l(new h1(zVar.B), 10), 11), 11), 10), gVar, 22), new an.i(zVar, gVar, (a71.c) null, 8), 6), 3);
            default:
                boolean z4 = this.w;
                b71.a aVar4 = b71.a.r;
                sy.y.j(obj);
                k71.k.g("- send successful? " + z4, "message");
                if (!z4) {
                    return new f8(new do0.m(2, null, 9));
                }
                String str4 = gVar.a;
                LinkedHashMap linkedHashMap4 = zVar.z;
                final py0.o oVar = new py0.o(18);
                linkedHashMap4.compute(str4, new BiFunction() { // from class: go0.a
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        switch (i6) {
                            case 0:
                                return (f) oVar.s(obj3, obj4);
                            case 1:
                                return (f) oVar.s(obj3, obj4);
                            case 2:
                                return (f) ((b) oVar).s(obj3, obj4);
                            case 3:
                                return (hd0.d) oVar.s(obj3, obj4);
                            case 4:
                                return (hd0.d) ((b) oVar).s(obj3, obj4);
                            case 5:
                                return (hd0.d) oVar.s(obj3, obj4);
                            case 6:
                                return (kp.d) oVar.s(obj3, obj4);
                            case 7:
                                return (kp.d) ((b) oVar).s(obj3, obj4);
                            case 8:
                                return (kp.d) oVar.s(obj3, obj4);
                            case 9:
                                return (r20.d) ((py0.o) oVar).s(obj3, obj4);
                            case 10:
                                return (r20.d) ((py0.o) oVar).s(obj3, obj4);
                            default:
                                return (r20.d) ((b) oVar).s(obj3, obj4);
                        }
                    }
                });
                return new aq.c(new y71.y(new l0(new cn.q(new cn.q(new az0.c(new y00.l(new h1(zVar.B), 10), 27), 17), 16), gVar, i4), new an.i(zVar, gVar, (a71.c) null, 9), 6), 7);
        }
    }
}
