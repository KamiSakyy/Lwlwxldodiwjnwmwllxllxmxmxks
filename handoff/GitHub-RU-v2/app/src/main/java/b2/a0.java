package b2;

/* loaded from: /home/user/work/p/classes.dex */
public final class a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f3315b = new a0();

    /* renamed from: c, reason: collision with root package name */
    public static final a0 f3316c = new a0();

    /* renamed from: d, reason: collision with root package name */
    public static final a0 f3317d = new a0();

    /* renamed from: a, reason: collision with root package name */
    public final l1.e f3318a = new l1.e(new c0[16]);

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0048, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(a0 a0Var) {
        a0Var.getClass();
        if (a0Var == f3315b) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (a0Var == f3316c) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        l1.e eVar = a0Var.f3318a;
        int i = eVar.f27903t;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        Object[] objArr = eVar.f27901r;
        for (int i10 = 0; i10 < i; i10++) {
            w1.q qVar = (w1.q) ((c0) objArr[i10]);
            if (!qVar.f32947r.E) {
                t2.a.b("visitChildren called on an unattached node");
            }
            l1.e eVar2 = new l1.e(new w1.q[16]);
            w1.q qVar2 = qVar.f32947r;
            w1.q qVar3 = qVar2.f32952w;
            if (qVar3 == null) {
                v2.l.b(eVar2, qVar2);
            } else {
                eVar2.b(qVar3);
            }
            while (true) {
                int i11 = eVar2.f27903t;
                if (i11 != 0) {
                    w1.q qVar4 = (w1.q) eVar2.l(i11 - 1);
                    if ((qVar4.f32950u & 1024) == 0) {
                        v2.l.b(eVar2, qVar4);
                    } else {
                        while (true) {
                            if (qVar4 == null) {
                                break;
                            }
                            if ((qVar4.f32949t & 1024) != 0) {
                                l1.e eVar3 = null;
                                while (qVar4 != null) {
                                    if (qVar4 instanceof h0) {
                                        if (((h0) qVar4).V0(7)) {
                                            break;
                                        }
                                    } else if ((qVar4.f32949t & 1024) != 0 && (qVar4 instanceof v2.k)) {
                                        int i12 = 0;
                                        for (w1.q qVar5 = ((v2.k) qVar4).G; qVar5 != null; qVar5 = qVar5.f32952w) {
                                            if ((qVar5.f32949t & 1024) != 0) {
                                                i12++;
                                                if (i12 == 1) {
                                                    qVar4 = qVar5;
                                                } else {
                                                    if (eVar3 == null) {
                                                        eVar3 = new l1.e(new w1.q[16]);
                                                    }
                                                    if (qVar4 != null) {
                                                        eVar3.b(qVar4);
                                                        qVar4 = null;
                                                    }
                                                    eVar3.b(qVar5);
                                                }
                                            }
                                        }
                                        if (i12 == 1) {
                                        }
                                    }
                                    qVar4 = v2.l.e(eVar3);
                                }
                            } else {
                                qVar4 = qVar4.f32952w;
                            }
                        }
                    }
                }
            }
        }
    }

    public static  a(Object... a) {
        return null;
    }
}
