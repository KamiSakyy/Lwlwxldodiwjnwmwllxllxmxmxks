package no;

import a81.t;
import aa.c;
import aa.l;
import aa.n;
import aa.o0;
import aa.q0;
import aa.r;
import aa.u0;
import aa.w;
import aa.x;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import androidx.compose.runtime.s;
import b2.a0;
import ea.e;
import ea.f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import k71.k;
import r7.g;
import r7.j;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ int a(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i2;
    }

    public static int b(ArrayList arrayList, int i, int i2) {
        return (arrayList.hashCode() + i) * i2;
    }

    public static n c(List list, String str, String str2, List list2, List list3) {
        k.g(list, str);
        return new n(str2, list2, list3);
    }

    public static r d(q0 q0Var) {
        return l0.b(l0.a(l0.b(q0Var)));
    }

    public static o0 e(f fVar, String str, w wVar, x xVar) {
        fVar.z0(str);
        return c.b(wVar.e(xVar));
    }

    public static a0 f(s sVar) {
        a0 a0Var = new a0();
        sVar.n0(a0Var);
        return a0Var;
    }

    public static Object g(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static Object h(w wVar, x xVar, e eVar, w wVar2) {
        return c.b(wVar.e(xVar)).a(eVar, wVar2);
    }

    public static String i(char c, String str, String str2) {
        return str + str2 + c;
    }

    public static String j(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String k(String str, int i) {
        return str + i;
    }

    public static String l(String str, int i, char c) {
        return str + i + c;
    }

    public static String m(String str, String str2, String str3, e30.a aVar, String str4) {
        return str + str2 + str3 + aVar + str4;
    }

    public static String n(String str, StringBuilder sb) {
        return str + ((Object) sb);
    }

    public static String o(String str, j jVar, String str2, j jVar2) {
        return str + jVar + str2 + jVar2;
    }

    public static String p(StringBuilder sb, ja0.a aVar, String str) {
        sb.append(aVar);
        sb.append(str);
        return sb.toString();
    }

    public static String q(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static LinkedHashSet r(LinkedHashMap linkedHashMap, String str, g gVar) {
        linkedHashMap.put(str, gVar);
        return new LinkedHashSet();
    }

    public static List s(t tVar, u0 u0Var) {
        return d0Shadow.n(new aa.k(tVar, u0Var));
    }

    public static List t(String str, boolean z) {
        return d0Shadow.n(new l(str, z));
    }

    public static Map u(String str, List list) {
        return x61.x.t(new w61.k(str, list));
    }

    public static k71.w v(String str, String str2) {
        k.g(str, str2);
        return new k71.w();
    }

    public static void w(int i, int i2, int i3, int i4, int i5) {
        o2.c.a(i);
        o2.c.a(i2);
        o2.c.a(i3);
        o2.c.a(i4);
        o2.c.a(i5);
    }

    public static /* synthetic */ void x(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ void y(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }


    public static Object g;

    public static Object s(Object... a) {
        return null;
    }

    public static Object e(Object... a) {
        return null;
    }

    public static Object h(Object... a) {
        return null;
    }

    public static Object c(Object... a) {
        return null;
    }

    public static Object d(Object... a) {
        return null;
    }

    public static Object b(Object... a) {
        return null;
    }
}
