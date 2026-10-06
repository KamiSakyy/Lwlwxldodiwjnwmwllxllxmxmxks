package sy;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.foundation.lazy.layout.q1;
import androidx.lifecycle.t1;
import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.discussions.type.DiscussionStateReason;
import com.github.service.models.response.shortcuts.ShortcutType;
import gn0.pu;
import hc0.i9;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import m10.xc;
import rz.j0;
import t00.xa;
import w50.i0;
import yz0.g4;
import yz0.x7;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class o {
    public static final g4 a(qw.f fVar) {
        String str;
        qw.c cVar;
        qw.e eVar;
        List list;
        qw.b bVar;
        Integer valueOf;
        boolean z = fVar.a;
        String str2 = fVar.c;
        String str3 = fVar.d;
        List list2 = fVar.h.a;
        if (list2 == null || (cVar = (qw.c) x61.m.W(list2)) == null || (eVar = cVar.a) == null || (list = eVar.a) == null || (bVar = (qw.b) x61.m.f0(list)) == null) {
            str = null;
        } else {
            es.a aVar = bVar.b;
            xc xcVar = aVar.a;
            if (xcVar == xc.u) {
                valueOf = aVar.c;
            } else {
                Integer num = aVar.d;
                valueOf = Integer.valueOf(num != null ? num.intValue() : 0);
            }
            str = valueOf + ":" + xcVar;
        }
        return new g4(z, str2, str3, str, fVar.e, fVar.f, aa1.b.S(fVar.g));
    }

    public static int b(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static p41.a c(String str, String str2) {
        y51.a aVar = new y51.a(str, str2);
        i4.u a = p41.a.a(y51.a.class);
        a.b = 1;
        a.f = new c5.b(17, aVar);
        return a.b();
    }

    public static Handler d(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a5.l.e(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final Long e(String str, List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (t71.w.F((String) obj, str.concat("::"), false)) {
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 != null) {
            return t71.w.H(t71.p.l0(str2, "::", str2));
        }
        return null;
    }

    public static final xa f(Object obj, com.github.service.wrapper.j jVar, String str, String str2) {
        k71.k.g(jVar, "client");
        k71.k.g(str, "viewId");
        k71.k.g(str2, "fullDatabaseId");
        return new xa(com.github.service.wrapper.a.o(jVar, new j0(str, str2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), obj, 0);
    }

    public static final Long g(List list) {
        String str = (String) x61.m.W(list);
        if (str != null) {
            return t71.w.H(str);
        }
        return null;
    }

    public static p41.a h(String str, d8.m mVar) {
        i4.u a = p41.a.a(y51.a.class);
        a.b = 1;
        a.a(p41.i.a(Context.class));
        a.f = new q1(16, str, mVar);
        return a.b();
    }

    public static x6.p i(t1 t1Var) {
        l61.d dVar = x6.q.a;
        t6.a aVar = t6.a.b;
        k71.k.g(dVar, "factory");
        k71.k.g(aVar, "extras");
        w51.r rVar = new w51.r(t1Var, dVar, aVar);
        k71.e a = k71.x.a(x6.p.class);
        String b = a.b();
        if (b != null) {
            return rVar.E(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public static int j(int i, CharSequence charSequence) {
        char charAt;
        char charAt2;
        while (i < charSequence.length() && ((charAt2 = charSequence.charAt(i)) == ' ' || charAt2 == '\t')) {
            i++;
        }
        if (i < charSequence.length() && charSequence.charAt(i) == '\n') {
            while (true) {
                i++;
                if (i >= charSequence.length() || ((charAt = charSequence.charAt(i)) != ' ' && charAt != '\t')) {
                    break;
                }
            }
        }
        return i;
    }

    public static final pu k(ShortcutType shortcutType) {
        int i = shortcutType == null ? -1 : vl0.n.a[shortcutType.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return pu.u;
            }
            if (i == 2) {
                return pu.v;
            }
            if (i == 3) {
                return pu.t;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return pu.w;
    }

    public static final bb0.f l(a60.a aVar) {
        return new bb0.f(aVar.c, aVar.b, aVar.d);
    }

    public static final DiscussionStateReason m(i9 i9Var) {
        k71.k.g(i9Var, "<this>");
        int ordinal = i9Var.ordinal();
        if (ordinal == 0) {
            return DiscussionStateReason.DUPLICATE;
        }
        if (ordinal == 1) {
            return DiscussionStateReason.OUTDATED;
        }
        if (ordinal == 2) {
            return DiscussionStateReason.REOPENED;
        }
        if (ordinal == 3) {
            return DiscussionStateReason.RESOLVED;
        }
        if (ordinal == 4) {
            return DiscussionStateReason.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final x7 n(i0 i0Var) {
        IssueOrPullRequestState issueOrPullRequestState;
        int ordinal = i0Var.b.ordinal();
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
        return new x7(issueOrPullRequestState, i0Var.d);
    }

    public static int o(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }
    public static final Object z = null;
}
