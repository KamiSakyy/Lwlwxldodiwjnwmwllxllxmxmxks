package b61;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import k71.k;
import sy.y;
import v41.i;
import x61.x;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public static final c a = new c();
    public static final Map b = Collections.synchronizedMap(new LinkedHashMap());

    public static a a(d dVar) {
        Map map = b;
        k.f(map, "dependencies");
        Object obj = map.get(dVar);
        if (obj != null) {
            return (a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + dVar + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b0 A[Catch: all -> 0x00c9, TRY_ENTER, TryCatch #0 {all -> 0x00c9, blocks: (B:12:0x009b, B:23:0x00b0, B:24:0x00c8), top: B:11:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0099 -> B:10:0x009a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(c71.c cVar) {
        b bVar;
        int i;
        Map linkedHashMap;
        Iterator it;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i2 = bVar.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.C = i2 - Integer.MIN_VALUE;
                Object obj = bVar.A;
                b71.a aVar = b71.a.r;
                i = bVar.C;
                if (i != 0) {
                    y.j(obj);
                    Map map = b;
                    k.f(map, "dependencies");
                    linkedHashMap = new LinkedHashMap(x.s(map.size()));
                    it = map.entrySet().iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object key = bVar.z;
                    linkedHashMap = bVar.y;
                    e81.c cVar2 = bVar.x;
                    d dVar = bVar.w;
                    it = bVar.v;
                    Map map2 = bVar.u;
                    y.j(obj);
                    try {
                        k.g(dVar, "subscriberName");
                        i iVar = a(dVar).b;
                        if (iVar == null) {
                            cVar2.f((Object) null);
                            linkedHashMap.put(key, iVar);
                            linkedHashMap = map2;
                            if (it.hasNext()) {
                                return linkedHashMap;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            key = entry.getKey();
                            dVar = (d) entry.getKey();
                            cVar2 = ((a) entry.getValue()).a;
                            Map map3 = linkedHashMap;
                            bVar.u = map3;
                            bVar.v = it;
                            bVar.w = dVar;
                            bVar.x = cVar2;
                            bVar.y = map3;
                            bVar.z = key;
                            bVar.C = 1;
                            if (cVar2.m(bVar) == aVar) {
                                return aVar;
                            }
                            map2 = linkedHashMap;
                            k.g(dVar, "subscriberName");
                            i iVar2 = a(dVar).b;
                            if (iVar2 == null) {
                                throw new IllegalStateException("Subscriber " + dVar + " has not been registered.");
                            }
                        }
                    } catch (Throwable th) {
                        cVar2.f((Object) null);
                        throw th;
                    }
                }
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.A;
        b71.a aVar2 = b71.a.r;
        i = bVar.C;
        if (i != 0) {
        }
    }
}
