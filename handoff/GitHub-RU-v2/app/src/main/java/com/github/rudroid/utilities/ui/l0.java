package com.github.rudroid.utilities.ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.URLSpan;
import androidx.compose.runtime.b2;
import com.github.rudroid.html.b;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l0 {
    /* JADX WARN: Removed duplicated region for block: B:103:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, com.github.rudroid.html.b bVar, w1.r rVar, b.a aVar, Integer num, d2.t tVar, androidx.compose.runtime.s sVar, int i, int i2) {
        int i3;
        w1.r rVar2;
        int i4;
        b.a aVar2;
        int i5;
        Integer num2;
        int i6;
        d2.t tVar2;
        w1.r rVar3;
        b2 t;
        int i7;
        w1.r rVar4;
        boolean z;
        k71.k.g(str, "htmlText");
        k71.k.g(bVar, "htmlStyler");
        sVar.e0(-535869612);
        if ((i & 6) == 0) {
            i3 = (sVar.f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.h(bVar) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            rVar2 = rVar;
            i3 |= sVar.f(rVar2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                aVar2 = aVar;
                i3 |= sVar.h(aVar2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    num2 = num;
                    i3 |= sVar.f(num2) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((196608 & i) == 0) {
                        tVar2 = tVar;
                        i3 |= sVar.f(tVar2) ? 131072 : 65536;
                        if (sVar.S(i3 & 1, (i3 & 74899) != 74898)) {
                            if (i8 != 0) {
                                rVar4 = w1.o.a;
                                i7 = i4;
                            } else {
                                i7 = i4;
                                rVar4 = rVar2;
                            }
                            if (i7 != 0) {
                                aVar2 = null;
                            }
                            if (i5 != 0) {
                                num2 = null;
                            }
                            if (i6 != 0) {
                                tVar2 = null;
                            }
                            int i9 = i3 & 14;
                            boolean f = (i9 == 4) | sVar.f(aVar2);
                            Object N = sVar.N();
                            Object obj = androidx.compose.runtime.n.a;
                            if (f || N == obj) {
                                if (aVar2 != null) {
                                    Spanned fromHtml = Html.fromHtml(str, 0);
                                    k71.k.f(fromHtml, "fromHtml(...)");
                                    Object[] spans = fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
                                    k71.k.f(spans, "getSpans(...)");
                                    z = !(spans.length == 0);
                                } else {
                                    z = false;
                                }
                                N = Boolean.valueOf(z);
                                sVar.n0(N);
                            }
                            boolean booleanValue = ((Boolean) N).booleanValue();
                            boolean g = sVar.g(booleanValue) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072);
                            Object N2 = sVar.N();
                            if (g || N2 == obj) {
                                N2 = new com.github.rudroid.issueorpullrequest.assigncopilot.n(booleanValue, num2, tVar2, 1);
                                sVar.n0(N2);
                            }
                            j71.c cVar = (j71.c) N2;
                            boolean h = (i9 == 4) | sVar.h(bVar) | sVar.h(aVar2);
                            Object N3 = sVar.N();
                            if (h || N3 == obj) {
                                N3 = new k1(bVar, str, aVar2, 2);
                                sVar.n0(N3);
                            }
                            v3.k.a((i3 >> 3) & 112, 0, sVar, cVar, (j71.c) N3, rVar4);
                            rVar3 = rVar4;
                        } else {
                            sVar.V();
                            rVar3 = rVar2;
                        }
                        b.a aVar3 = aVar2;
                        Integer num3 = num2;
                        d2.t tVar3 = tVar2;
                        t = sVar.t();
                        if (t != null) {
                            t.d = new ab.g(str, bVar, rVar3, aVar3, num3, tVar3, i, i2);
                            return;
                        }
                        return;
                    }
                    tVar2 = tVar;
                    if (sVar.S(i3 & 1, (i3 & 74899) != 74898)) {
                    }
                    b.a aVar32 = aVar2;
                    Integer num32 = num2;
                    d2.t tVar32 = tVar2;
                    t = sVar.t();
                    if (t != null) {
                    }
                }
                num2 = num;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                tVar2 = tVar;
                if (sVar.S(i3 & 1, (i3 & 74899) != 74898)) {
                }
                b.a aVar322 = aVar2;
                Integer num322 = num2;
                d2.t tVar322 = tVar2;
                t = sVar.t();
                if (t != null) {
                }
            }
            aVar2 = aVar;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            num2 = num;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            tVar2 = tVar;
            if (sVar.S(i3 & 1, (i3 & 74899) != 74898)) {
            }
            b.a aVar3222 = aVar2;
            Integer num3222 = num2;
            d2.t tVar3222 = tVar2;
            t = sVar.t();
            if (t != null) {
            }
        }
        rVar2 = rVar;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        aVar2 = aVar;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        num2 = num;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        tVar2 = tVar;
        if (sVar.S(i3 & 1, (i3 & 74899) != 74898)) {
        }
        b.a aVar32222 = aVar2;
        Integer num32222 = num2;
        d2.t tVar32222 = tVar2;
        t = sVar.t();
        if (t != null) {
        }
    }
}
