package p5;

import com.google.android.gms.internal.measurement.d5;
import h91.c0;
import h91.d0;
import h91.o;
import h91.v;
import java.io.FileNotFoundException;
import k71.k;
import n5.l0;
import n5.v0;
import sy.u;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class j extends c implements v0 {
    /* JADX WARN: Removed duplicated region for block: B:16:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bc A[Catch: Exception -> 0x00b6, TRY_LEAVE, TryCatch #6 {Exception -> 0x00b6, blocks: (B:20:0x00bc, B:42:0x00b2, B:62:0x004b, B:39:0x00ad), top: B:61:0x004b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7 A[Catch: all -> 0x009b, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x009b, blocks: (B:33:0x00a7, B:54:0x0097, B:51:0x0092), top: B:50:0x0092, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // n5.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(a71.c cVar, Object obj) {
        i iVar;
        int i;
        v vVar;
        Throwable th;
        Throwable th2;
        d0 d0Var;
        v vVar2;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i10 = iVar.f30403z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f30403z = i10 - Integer.MIN_VALUE;
                Object obj2 = iVar.f30401x;
                a0 a0Var = b71.a.r;
                i = iVar.f30403z;
                a0 a0Var2 = a0.a;
                h91.a0 a0Var3 = this.f30368b;
                Throwable th3 = null;
                if (i != 0) {
                    y.j(obj2);
                    if (this.f30370d.f30361a.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    try {
                        o oVar = this.f30367a;
                        oVar.getClass();
                        k.g(a0Var3, "file");
                        v W = oVar.W(a0Var3);
                        try {
                            d0 b10 = h91.b.b(v.f(W));
                            try {
                                kk.a aVar = this.f30369c;
                                iVar.f30398u = W;
                                iVar.f30399v = W;
                                iVar.f30400w = b10;
                                iVar.f30403z = 1;
                                ((l0) aVar.s).c(obj, new c0(b10));
                                if (a0Var2 == a0Var) {
                                    return a0Var;
                                }
                                vVar = W;
                                vVar2 = vVar;
                                d0Var = b10;
                            } catch (Throwable th4) {
                                vVar = W;
                                th2 = th4;
                                d0Var = b10;
                                if (d0Var != null) {
                                }
                                if (th2 == null) {
                                }
                            }
                        } catch (Throwable th5) {
                            vVar = W;
                            th = th5;
                            if (vVar != null) {
                                try {
                                    vVar.close();
                                } catch (Throwable th6) {
                                    u.a(th, th6);
                                }
                            }
                            th3 = th;
                            if (th3 == null) {
                            }
                        }
                    } catch (Exception e5) {
                        if (e5 instanceof FileNotFoundException) {
                            throw d5.j0(String.valueOf(a0Var3.c()), (FileNotFoundException) e5);
                        }
                        throw e5;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d0Var = iVar.f30400w;
                    vVar2 = iVar.f30399v;
                    vVar = iVar.f30398u;
                    try {
                        y.j(obj2);
                    } catch (Throwable th7) {
                        th2 = th7;
                        if (d0Var != null) {
                            try {
                                try {
                                    d0Var.close();
                                } catch (Throwable th8) {
                                    u.a(th2, th8);
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                if (vVar != null) {
                                }
                                th3 = th;
                                if (th3 == null) {
                                }
                            }
                        }
                        if (th2 == null) {
                        }
                    }
                }
                vVar2.flush();
                if (d0Var != null) {
                    try {
                        d0Var.close();
                    } catch (Throwable th10) {
                        th2 = th10;
                    }
                }
                th2 = null;
                if (th2 == null) {
                    throw th2;
                }
                if (vVar != null) {
                    try {
                        vVar.close();
                    } catch (Throwable th11) {
                        th3 = th11;
                    }
                }
                if (th3 == null) {
                    return a0Var2;
                }
                throw th3;
            }
        }
        iVar = new i(this, (c71.c) cVar);
        Object obj22 = iVar.f30401x;
        a0 a0Var4 = b71.a.r;
        i = iVar.f30403z;
        a0 a0Var22 = a0.a;
        h91.a0 a0Var32 = this.f30368b;
        Throwable th32 = null;
        if (i != 0) {
        }
        vVar2.flush();
        if (d0Var != null) {
        }
        th2 = null;
        if (th2 == null) {
        }
    }
}
