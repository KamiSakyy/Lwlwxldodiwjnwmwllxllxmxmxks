package l6;

import android.content.Context;
import c71.j;
import java.util.LinkedHashMap;
import java.util.Map;
import k71.k;
import sy.y;
import w61.a0;
import y71.i;
import y71.n1;

/* loaded from: /home/user/work/p/classes.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public static final f f28037a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final e81.c f28038b = e81.d.a();

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f28039c = new LinkedHashMap();

    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, g gVar, String str, c71.c cVar) {
        b bVar;
        int i;
        e81.a aVar;
        try {
            if (cVar instanceof b) {
                bVar = (b) cVar;
                int i10 = bVar.A;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    bVar.A = i10 - Integer.MIN_VALUE;
                    Object obj = bVar.f28022y;
                    b71.a aVar2 = b71.a.r;
                    i = bVar.A;
                    if (i != 0) {
                        y.j(obj);
                        bVar.f28018u = context;
                        bVar.f28019v = gVar;
                        bVar.f28020w = str;
                        aVar = f28038b;
                        bVar.f28021x = aVar;
                        bVar.A = 1;
                        if (aVar.m(bVar) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        e81.a aVar3 = bVar.f28021x;
                        str = bVar.f28020w;
                        gVar = bVar.f28019v;
                        Context context2 = bVar.f28018u;
                        y.j(obj);
                        aVar = aVar3;
                        context = context2;
                    }
                    f28039c.remove(str);
                    gVar.a(context, str).delete();
                    aVar.f((Object) null);
                    return a0.a;
                }
            }
            f28039c.remove(str);
            gVar.a(context, str).delete();
            aVar.f((Object) null);
            return a0.a;
        } catch (Throwable th) {
            aVar.f((Object) null);
            throw th;
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.f28022y;
        b71.a aVar22 = b71.a.r;
        i = bVar.A;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0065, code lost:
    
        if (r10.m(r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #1 {all -> 0x008d, blocks: (B:26:0x0068, B:28:0x0070), top: B:25:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, g gVar, String str, c71.c cVar) {
        c cVar2;
        int i;
        e81.a aVar;
        e81.a aVar2;
        Object obj;
        String str2;
        Map map;
        try {
            if (cVar instanceof c) {
                cVar2 = (c) cVar;
                int i10 = cVar2.A;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    cVar2.A = i10 - Integer.MIN_VALUE;
                    Object obj2 = cVar2.f28028y;
                    b71.a aVar3 = b71.a.r;
                    i = cVar2.A;
                    if (i != 0) {
                        y.j(obj2);
                        cVar2.f28024u = context;
                        cVar2.f28025v = gVar;
                        cVar2.f28026w = str;
                        aVar = f28038b;
                        cVar2.f28027x = aVar;
                        cVar2.A = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str2 = cVar2.f28026w;
                            map = (Map) cVar2.f28025v;
                            aVar2 = (e81.a) cVar2.f28024u;
                            try {
                                y.j(obj2);
                                obj = (n5.f) obj2;
                                map.put(str2, obj);
                                k.e(obj, "null cannot be cast to non-null type androidx.datastore.core.DataStore<T of androidx.glance.state.GlanceState.getDataStore>");
                                n5.f fVar = (n5.f) obj;
                                aVar2.f((Object) null);
                                return fVar;
                            } catch (Throwable th) {
                                th = th;
                                aVar2.f((Object) null);
                                throw th;
                            }
                        }
                        e81.a aVar4 = cVar2.f28027x;
                        str = cVar2.f28026w;
                        gVar = (g) cVar2.f28025v;
                        Context context2 = (Context) cVar2.f28024u;
                        y.j(obj2);
                        aVar = aVar4;
                        context = context2;
                    }
                    LinkedHashMap linkedHashMap = f28039c;
                    obj = linkedHashMap.get(str);
                    if (obj == null) {
                        aVar2 = aVar;
                        k.e(obj, "null cannot be cast to non-null type androidx.datastore.core.DataStore<T of androidx.glance.state.GlanceState.getDataStore>");
                        n5.f fVar2 = (n5.f) obj;
                        aVar2.f((Object) null);
                        return fVar2;
                    }
                    cVar2.f28024u = aVar;
                    cVar2.f28025v = linkedHashMap;
                    cVar2.f28026w = str;
                    cVar2.f28027x = null;
                    cVar2.A = 2;
                    Object b10 = gVar.b(context, str);
                    if (b10 != aVar3) {
                        e81.a aVar5 = aVar;
                        obj2 = b10;
                        str2 = str;
                        aVar2 = aVar5;
                        map = linkedHashMap;
                        obj = (n5.f) obj2;
                        map.put(str2, obj);
                        k.e(obj, "null cannot be cast to non-null type androidx.datastore.core.DataStore<T of androidx.glance.state.GlanceState.getDataStore>");
                        n5.f fVar22 = (n5.f) obj;
                        aVar2.f((Object) null);
                        return fVar22;
                    }
                    return aVar3;
                }
            }
            LinkedHashMap linkedHashMap2 = f28039c;
            obj = linkedHashMap2.get(str);
            if (obj == null) {
            }
        } catch (Throwable th2) {
            th = th2;
            aVar2 = aVar;
            aVar2.f((Object) null);
            throw th;
        }
        cVar2 = new c(this, cVar);
        Object obj22 = cVar2.f28028y;
        b71.a aVar32 = b71.a.r;
        i = cVar2.A;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (r9 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Context context, g gVar, String str, c71.c cVar) {
        d dVar;
        int i;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i10 = dVar.f28032w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f28032w = i10 - Integer.MIN_VALUE;
                Object obj = dVar.f28030u;
                Object obj2 = b71.a.r;
                i = dVar.f28032w;
                if (i != 0) {
                    y.j(obj);
                    dVar.f28032w = 1;
                    obj = b(context, gVar, str, dVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y.j(obj);
                        return obj;
                    }
                    y.j(obj);
                }
                i data = ((n5.f) obj).getData();
                dVar.f28032w = 2;
                Object t10 = n1.t(data, dVar);
                return t10 != obj2 ? obj2 : t10;
            }
        }
        dVar = new d(this, cVar);
        Object obj3 = dVar.f28030u;
        Object obj22 = b71.a.r;
        i = dVar.f28032w;
        if (i != 0) {
        }
        i data2 = ((n5.f) obj3).getData();
        dVar.f28032w = 2;
        Object t102 = n1.t(data2, dVar);
        if (t102 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r10 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Context context, g gVar, String str, j71.e eVar, c71.c cVar) {
        e eVar2;
        int i;
        if (cVar instanceof e) {
            eVar2 = (e) cVar;
            int i10 = eVar2.f28036x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar2.f28036x = i10 - Integer.MIN_VALUE;
                Object obj = eVar2.f28034v;
                Object obj2 = b71.a.r;
                i = eVar2.f28036x;
                if (i != 0) {
                    y.j(obj);
                    eVar2.f28033u = (j) eVar;
                    eVar2.f28036x = 1;
                    obj = b(context, gVar, str, eVar2);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y.j(obj);
                        return obj;
                    }
                    eVar = (j71.e) eVar2.f28033u;
                    y.j(obj);
                }
                eVar2.f28033u = null;
                eVar2.f28036x = 2;
                Object a10 = ((n5.f) obj).a(eVar, eVar2);
                return a10 != obj2 ? obj2 : a10;
            }
        }
        eVar2 = new e(this, cVar);
        Object obj3 = eVar2.f28034v;
        Object obj22 = b71.a.r;
        i = eVar2.f28036x;
        if (i != 0) {
        }
        eVar2.f28033u = null;
        eVar2.f28036x = 2;
        Object a102 = ((n5.f) obj3).a(eVar, eVar2);
        if (a102 != obj22) {
        }
    }

    public static Object a;
}
