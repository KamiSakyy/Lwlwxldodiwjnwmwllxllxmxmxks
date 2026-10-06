package p5;

import com.google.android.gms.internal.measurement.d5;
import h91.a0;
import h91.e0;
import h91.o;
import java.io.FileNotFoundException;
import k71.k;
import n5.j0;
import n5.l0;
import n5.m;
import sy.u;
import sy.y;

/* loaded from: /home/user/work/p/classes.dex */
public class c implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final o f30367a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f30368b;

    /* renamed from: c, reason: collision with root package name */
    public final kk.a f30369c;

    /* renamed from: d, reason: collision with root package name */
    public final a f30370d;

    public c(o oVar, a0 a0Var, kk.a aVar) {
        k.g(oVar, "fileSystem");
        k.g(a0Var, "path");
        this.f30367a = oVar;
        this.f30368b = a0Var;
        this.f30369c = aVar;
        this.f30370d = new a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f6 A[Catch: Exception -> 0x00f7, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x00f7, blocks: (B:20:0x00f6, B:62:0x00b1), top: B:61:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0 A[Catch: FileNotFoundException -> 0x0098, TRY_LEAVE, TryCatch #7 {FileNotFoundException -> 0x0098, blocks: (B:54:0x00a0, B:83:0x0094, B:80:0x008f), top: B:79:0x008f, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v23, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v29, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v35, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object f(c cVar, c71.c cVar2) {
        b bVar;
        int i;
        e0 c10;
        c cVar3;
        e0 e0Var;
        Throwable th;
        Throwable th2;
        o oVar;
        a0 a0Var;
        c cVar4;
        e0 e0Var2;
        Object th3;
        Object b10;
        if (cVar2 instanceof b) {
            bVar = (b) cVar2;
            int i10 = bVar.f30366y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f30366y = i10 - Integer.MIN_VALUE;
                Object obj = bVar.f30364w;
                b71.a aVar = b71.a.r;
                i = bVar.f30366y;
                Object th4 = null;
                if (i != 0) {
                    y.j(obj);
                    if (cVar.f30370d.f30361a.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    try {
                        c10 = h91.b.c(cVar.f30367a.e0(cVar.f30368b));
                    } catch (FileNotFoundException unused) {
                        oVar = cVar.f30367a;
                        l0 l0Var = (l0) cVar.f30369c.s;
                        a0Var = cVar.f30368b;
                        if (oVar.F(a0Var)) {
                            return l0Var.a();
                        }
                        try {
                            e0 c11 = h91.b.c(cVar.f30367a.e0(a0Var));
                            try {
                                bVar.f30362u = cVar;
                                bVar.f30363v = c11;
                                bVar.f30366y = 2;
                                b10 = l0Var.b(new h91.g(c11, 1));
                            } catch (Throwable th5) {
                                cVar4 = cVar;
                                e0Var2 = c11;
                                th3 = th5;
                                if (e0Var2 != null) {
                                }
                                cVar = cVar4;
                                if (th3 != 0) {
                                }
                            }
                            if (b10 != aVar) {
                                cVar4 = cVar;
                                e0Var2 = c11;
                                obj = b10;
                                if (e0Var2 != null) {
                                }
                                Object obj2 = th4;
                                th4 = obj;
                                th3 = obj2;
                                cVar = cVar4;
                                if (th3 != 0) {
                                }
                            }
                            return aVar;
                        } catch (Exception e5) {
                            cVar4 = cVar;
                            e = e5;
                            if (e instanceof FileNotFoundException) {
                            }
                        }
                    }
                    try {
                        kk.a aVar2 = cVar.f30369c;
                        bVar.f30362u = cVar;
                        bVar.f30363v = c10;
                        bVar.f30366y = 1;
                        Object b11 = ((l0) aVar2.s).b(new h91.g(c10, 1));
                        if (b11 != aVar) {
                            cVar3 = cVar;
                            e0Var = c10;
                            obj = b11;
                        }
                        return aVar;
                    } catch (Throwable th6) {
                        cVar3 = cVar;
                        e0Var = c10;
                        th = th6;
                        if (e0Var != null) {
                        }
                        th2 = th;
                        obj = null;
                        if (th2 != null) {
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        e0Var2 = bVar.f30363v;
                        cVar4 = bVar.f30362u;
                        try {
                            y.j(obj);
                            if (e0Var2 != null) {
                                try {
                                    e0Var2.close();
                                } catch (Throwable th7) {
                                    th4 = th7;
                                }
                            }
                            Object obj22 = th4;
                            th4 = obj;
                            th3 = obj22;
                        } catch (Throwable th8) {
                            th3 = th8;
                            if (e0Var2 != null) {
                                try {
                                    e0Var2.close();
                                } catch (Throwable th9) {
                                    try {
                                        u.a((Throwable) th3, th9);
                                    } catch (Exception e10) {
                                        e = e10;
                                        if (e instanceof FileNotFoundException) {
                                            throw e;
                                        }
                                        throw d5.j0(String.valueOf(cVar4.f30368b.c()), (FileNotFoundException) e);
                                    }
                                }
                            }
                            cVar = cVar4;
                            if (th3 != 0) {
                            }
                        }
                        cVar = cVar4;
                        if (th3 != 0) {
                            return th4;
                        }
                        throw th3;
                    }
                    e0Var = bVar.f30363v;
                    cVar3 = bVar.f30362u;
                    try {
                        y.j(obj);
                    } catch (Throwable th10) {
                        th = th10;
                        if (e0Var != null) {
                            try {
                                try {
                                    e0Var.close();
                                } catch (Throwable th11) {
                                    u.a(th, th11);
                                }
                            } catch (FileNotFoundException unused2) {
                                cVar = cVar3;
                                oVar = cVar.f30367a;
                                l0 l0Var2 = (l0) cVar.f30369c.s;
                                a0Var = cVar.f30368b;
                                if (oVar.F(a0Var)) {
                                }
                            }
                        }
                        th2 = th;
                        obj = null;
                        if (th2 != null) {
                        }
                    }
                }
                if (e0Var != null) {
                    try {
                        e0Var.close();
                    } catch (Throwable th12) {
                        th2 = th12;
                    }
                }
                th2 = null;
                if (th2 != null) {
                    return obj;
                }
                throw th2;
            }
        }
        bVar = new b(cVar, cVar2);
        Object obj3 = bVar.f30364w;
        b71.a aVar3 = b71.a.r;
        i = bVar.f30366y;
        Object th42 = null;
        if (i != 0) {
        }
        if (e0Var != null) {
        }
        th2 = null;
        if (th2 != null) {
        }
    }

    @Override // n5.j0
    public final Object b(m mVar) {
        return f(this, mVar);
    }

    @Override // n5.a
    public final void close() {
        this.f30370d.f30361a.set(true);
    }
}
