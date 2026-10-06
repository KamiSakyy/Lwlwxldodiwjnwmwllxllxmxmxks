package dh;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.f2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import com.github.rudroid.agents.sessionevents.ui.q1;
import com.github.rudroid.settings.copilot.debug.q;
import com.github.rudroid.uitoolkit.text.h;
import d1.e0;
import d2.p0;
import f1.n2;
import f1.o2Shadow;
import f1.s2;
import f1.u2;
import f1.w3;
import f1.x3;
import java.util.Locale;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import l7.x1;
import q71.g;
import r1.i;
import u1.j;
import w1.o;
import w1.r;
import w2.j0;
import w3.t;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public static final f2 a = androidx.compose.foundation.layout.b.f(24, 16, 12, 0.0f, 8);

    public static final /* synthetic */ class a {
        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b bVar = b.r;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(r rVar, String str, long j, j71.c cVar, j71.a aVar, j71.a aVar2, b bVar, s sVar, int i, int i2) {
        r rVar2;
        int i3;
        r rVar3;
        b bVar2;
        b2 t;
        int i4;
        r rVar4;
        int i5;
        k.g(cVar, "onDateSelect");
        k.g(aVar, "onNegativeOptionSelect");
        k.g(aVar2, "onDismissSelect");
        sVar.e0(-637831698);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i3 = (sVar.f(rVar2) ? 4 : 2) | i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.f(str) ? 32 : 16;
        }
        int i7 = i3 | (sVar.e(j) ? 256 : 128);
        if ((i & 3072) == 0) {
            i7 |= sVar.h(cVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i7 |= sVar.h(aVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i7 |= sVar.h(aVar2) ? 131072 : 65536;
        }
        int i8 = i2 & 64;
        int i9 = 1572864;
        if (i8 == 0) {
            if ((1572864 & i) == 0) {
                i9 = sVar.d(bVar == null ? -1 : bVar.ordinal()) ? 1048576 : 524288;
            }
            if (sVar.S(i7 & 1, (599187 & i7) == 599186)) {
                sVar.V();
                rVar3 = rVar2;
                bVar2 = bVar;
            } else {
                if (i6 != 0) {
                    int i11 = i7;
                    rVar4 = o.a;
                    i4 = i11;
                } else {
                    i4 = i7;
                    rVar4 = rVar2;
                }
                b bVar3 = i8 != 0 ? b.r : bVar;
                Long valueOf = Long.valueOf(j);
                int ordinal = bVar3.ordinal();
                if (ordinal == 0) {
                    i5 = 0;
                } else {
                    if (ordinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5 = 1;
                }
                int i12 = i4 >> 6;
                float f = w3.a;
                g gVar = o2Shadow.b;
                n2 n2Var = o2Shadow.d;
                sVar.c0(2088426481);
                Locale locale = ((Configuration) sVar.j(j0.a)).getLocales().get(0);
                sVar.q(false);
                int i13 = i4;
                Object[] objArr = new Object[0];
                r rVar5 = rVar4;
                x1 b = j.b(new com.github.rudroid.widget.contribution.a(20), new e0(24, n2Var, locale));
                boolean f2 = ((((i12 & 14) ^ 6) > 4 && sVar.f(valueOf)) || (i12 & 6) == 4) | sVar.f(valueOf) | sVar.h(gVar) | sVar.d(i5) | sVar.f(n2Var) | sVar.h(locale);
                Object N = sVar.N();
                if (f2 || N == n.a) {
                    N = new u2(valueOf, valueOf, gVar, i5, n2Var, locale);
                    sVar.n0(N);
                }
                x3 x3Var = (x3) j.e(objArr, b, (j71.a) N, sVar, 0);
                x3Var.d.setValue(n2Var);
                s2.a(aVar2, i.d(-828455680, new q(26, cVar, x3Var), sVar), rVar5, i.d(329076610, new q1(15, aVar), sVar), (p0) null, 0.0f, c.a(ih.d.b(sVar).b, sVar, 1535), (t) null, i.d(-901268137, new com.github.rudroid.settings.codeoptions.g(15, x3Var, str), sVar), sVar, ((i13 >> 15) & 14) | 100666416 | ((i13 << 6) & 896));
                rVar3 = rVar5;
                bVar2 = bVar3;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new h(rVar3, str, j, cVar, aVar, aVar2, bVar2, i, i2);
                return;
            }
            return;
        }
        i7 |= i9;
        if (sVar.S(i7 & 1, (599187 & i7) == 599186)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }


}
