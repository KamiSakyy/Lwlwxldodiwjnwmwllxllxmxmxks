package com.github.rudroid.actions.checkssummary.model;

import a5.g1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import sy.f0;
import v8.l0;
import x61.l;
import x61.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public class b {
    public static final a Companion;

    /* renamed from: t, reason: collision with root package name */
    public static final b f5037t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ b[] f5038u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ d71.b f5039v;

    /* renamed from: r, reason: collision with root package name */
    public Set f5040r;

    /* renamed from: s, reason: collision with root package name */
    public int f5041s;

    public static final class a {
        public static b a(tz0.d dVar) {
            Object obj;
            d71.b bVar = b.f5039v;
            bVar.getClass();
            g1 g1Var = new g1(8, bVar);
            while (true) {
                if (!g1Var.hasNext()) {
                    obj = null;
                    break;
                }
                obj = g1Var.next();
                if (((b) obj).f5040r.contains(dVar)) {
                    break;
                }
            }
            b bVar2 = (b) obj;
            return bVar2 == null ? b.f5037t : bVar2;
        }

        public static LinkedHashMap b(List list) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                a aVar = b.Companion;
                tz0.d dVar = ((tz0.a) obj).a;
                aVar.getClass();
                b a10 = a(dVar);
                Object obj2 = linkedHashMap.get(a10);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(a10, obj2);
                }
                ((List) obj2).add(obj);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(x.s(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                Iterator it = ((List) entry.getValue()).iterator();
                int i = 0;
                while (it.hasNext()) {
                    i += ((tz0.a) it.next()).b;
                }
                linkedHashMap2.put(key, Integer.valueOf(i));
            }
            return linkedHashMap2;
        }
    }

    static {
        b bVar = new b("FAILURE", 0, l.j0(new tz0.d[]{tz0.d.u, tz0.d.w, tz0.d.E}), 2131954688);
        b bVar2 = new b("TIMED_OUT", 1, f0.r(tz0.d.G), 2131954697);
        b bVar3 = new b("PENDING", 2, l.j0(new tz0.d[]{tz0.d.r, tz0.d.z, tz0.d.H, tz0.d.I}), 2131954691);
        f5037t = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3, new b("QUEUED", 3, f0.r(tz0.d.A), 2131954692), new b("IN_PROGRESS", 4, f0.r(tz0.d.x), 2131954689), new b("STALE", 5, f0.r(tz0.d.D), 2131954695), new b("CANCELLED", 6, f0.r(tz0.d.s), 2131954686), new b("SKIPPED", 7, f0.r(tz0.d.C), 2131954694), new b("NEUTRAL", 8, f0.r(tz0.d.y), 2131954690), new b("EXPECTED", 9, f0.r(tz0.d.v), 2131954687), new b("REQUESTED", 10, f0.r(tz0.d.B), 2131954693), new b("SUCCESS", 11, l.j0(new tz0.d[]{tz0.d.F, tz0.d.t}), 2131954696)};
        f5038u = bVarArr;
        f5039v = l0.t(bVarArr);
        Companion = new a();
    }

    public b(String str, int i, Set set, int i10) {
        this.f5040r = set;
        this.f5041s = i10;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f5038u.clone();
    }
    public Object ordinal() { return null; }
}
