package sy;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.type.IssueState;
import ct.w0;
import gn0.xc;
import hc0.j6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.intellij.markdown.MarkdownParsingException;
import t00.xa;
import ux0.j0;
import vo.s1;
import yz0.p3;
import yz0.x7;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a0 {
    public static final t91.c a(s91.c cVar, t91.d dVar) {
        k71.k.g(dVar, "<this>");
        if (cVar.b != -1) {
            throw new MarkdownParsingException("");
        }
        t91.d b = ((t91.c) dVar).b(cVar);
        String str = cVar.d;
        while (true) {
            t91.d a = b.a(cVar.f(l(b, str) + 1));
            if (a == null) {
                return b;
            }
            b = a;
        }
    }

    public static final mn.e b(vo.g gVar, String str) {
        s1 s1Var;
        ArrayList arrayList = x61.r.r;
        if (gVar == null) {
            return new mn.e(0, arrayList, new x01.i((String) null, false, true));
        }
        vo.o oVar = gVar.b;
        x01.i iVar = new x01.i(oVar.c, oVar.a, true ^ oVar.b);
        List<vo.k> list = gVar.c;
        if (list != null) {
            arrayList = new ArrayList();
            for (vo.k kVar : list) {
                mn.a b = (kVar == null || (s1Var = kVar.c) == null) ? null : xo.a.b(s1Var, str);
                if (b != null) {
                    arrayList.add(b);
                }
            }
        }
        return new mn.e(gVar.a, arrayList, iVar);
    }

    public static final mn.e c(wc0.g gVar, String str) {
        wc0.s1 s1Var;
        ArrayList arrayList = x61.r.r;
        if (gVar == null) {
            return new mn.e(0, arrayList, new x01.i((String) null, false, true));
        }
        wc0.o oVar = gVar.b;
        x01.i iVar = new x01.i(oVar.c, oVar.a, true ^ oVar.b);
        List<wc0.k> list = gVar.c;
        if (list != null) {
            arrayList = new ArrayList();
            for (wc0.k kVar : list) {
                mn.a b = (kVar == null || (s1Var = kVar.c) == null) ? null : yc0.a.b(s1Var, str);
                if (b != null) {
                    arrayList.add(b);
                }
            }
        }
        return new mn.e(gVar.a, arrayList, iVar);
    }

    public static final b01.e d(ks.b bVar) {
        String str = bVar.a;
        String str2 = bVar.b;
        String str3 = bVar.c;
        boolean z = bVar.d;
        boolean z2 = bVar.e;
        String str4 = bVar.f;
        if (str4 == null) {
            str4 = "";
        }
        ks.a aVar = bVar.g;
        return new b01.e(str, str2, str3, z, z2, str4, aVar != null ? aVar.a : null);
    }

    public static final p3 e(a70.a aVar) {
        com.github.rudroid.common.f fVar;
        k71.k.g(aVar, "<this>");
        j6 j6Var = aVar.a;
        k71.k.g(j6Var, "dayOfWeek");
        switch (j6Var.ordinal()) {
            case 0:
                fVar = com.github.rudroid.common.f.y;
                break;
            case 1:
                fVar = com.github.rudroid.common.f.u;
                break;
            case 2:
                fVar = com.github.rudroid.common.f.z;
                break;
            case 3:
                fVar = com.github.rudroid.common.f.t;
                break;
            case 4:
                fVar = com.github.rudroid.common.f.x;
                break;
            case 5:
                fVar = com.github.rudroid.common.f.v;
                break;
            case 6:
                fVar = com.github.rudroid.common.f.w;
                break;
            case 7:
                com.github.rudroid.common.f.Companion.getClass();
                fVar = com.github.rudroid.common.f.r;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new p3(fVar, aVar.b, aVar.c, aVar.d);
    }

    public static void f(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder m = x.i.m(i, i2, "startIndex: ", ", endIndex: ", ", size: ");
            m.append(i3);
            throw new IndexOutOfBoundsException(m.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(no.a.j(i, i2, "startIndex: ", " > endIndex: "));
        }
    }

    public static void g(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder m = x.i.m(i, i2, "fromIndex: ", ", toIndex: ", ", size: ");
            m.append(i3);
            throw new IndexOutOfBoundsException(m.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(no.a.j(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static u5.p h(Context context) {
        ProviderInfo providerInfo;
        x4.c cVar;
        ApplicationInfo applicationInfo;
        u5.b bVar = Build.VERSION.SDK_INT >= 28 ? new u5.b(8) : new y60.b(8);
        PackageManager packageManager = context.getPackageManager();
        p.i(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] f = bVar.f(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : f) {
                    arrayList.add(signature.toByteArray());
                }
                cVar = new x4.c(str, str2, "emojicompat-emoji-font", (String) null, (String) null, Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
            }
            if (cVar != null) {
                return null;
            }
            return new u5.p(new u5.o(context, cVar));
        }
        cVar = null;
        if (cVar != null) {
        }
    }

    public static final CharSequence i(t91.d dVar, CharSequence charSequence) {
        k71.k.g(dVar, "<this>");
        k71.k.g(charSequence, "s");
        int length = charSequence.length();
        int i = ((t91.c) dVar).d;
        return length < i ? "" : charSequence.subSequence(i, charSequence.length());
    }

    public static final boolean j(t91.c cVar, t91.d dVar) {
        k71.k.g(cVar, "<this>");
        k71.k.g(dVar, "other");
        return cVar.h(dVar) && !cVar.c(((t91.c) dVar).b.length);
    }

    public static final xa k(Object obj, com.github.service.wrapper.j jVar, String str, String str2) {
        k71.k.g(jVar, "client");
        k71.k.g(str, "viewId");
        k71.k.g(str2, "fullDatabaseId");
        return new xa(com.github.service.wrapper.a.o(jVar, new j0(str, str2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), obj, 1);
    }

    public static final int l(t91.d dVar, CharSequence charSequence) {
        k71.k.g(dVar, "<this>");
        k71.k.g(charSequence, "s");
        return Math.min(((t91.c) dVar).d, charSequence.length());
    }

    public static final w61.k m(Object obj, Object obj2) {
        return new w61.k(obj, obj2);
    }

    public static final IssueState n(xc xcVar) {
        int ordinal = xcVar.ordinal();
        if (ordinal == 0) {
            return IssueState.CLOSED;
        }
        if (ordinal == 1) {
            return IssueState.OPEN;
        }
        if (ordinal == 2) {
            return IssueState.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final x7 o(w0 w0Var) {
        IssueOrPullRequestState issueOrPullRequestState;
        int ordinal = w0Var.b.ordinal();
        if (ordinal == 0) {
            issueOrPullRequestState = IssueOrPullRequestState.ISSUE_CLOSED;
        } else if (ordinal == 1) {
            issueOrPullRequestState = IssueOrPullRequestState.ISSUE_OPEN;
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
        }
        return new x7(issueOrPullRequestState, w0Var.d);
    }

    public static final boolean p(t91.c cVar, t91.d dVar) {
        k71.k.g(dVar, "other");
        return ((t91.c) dVar).h(cVar) && !cVar.c(cVar.b.length);
    }
    public Object A3() { return null; }
    public Object D(Object p1, Object p2) { return null; }
    public Object z(Object p1, Object p2) { return null; }
}
