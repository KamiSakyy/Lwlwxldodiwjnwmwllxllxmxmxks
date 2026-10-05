package com.github.rudroid.copilot;

import com.github.rudroid.copilot.threads.l;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class k4 implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9870r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o4 f9871s;

    public /* synthetic */ k4(o4 o4Var, int i) {
        this.f9870r = i;
        this.f9871s = o4Var;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.time.ZonedDateTime] */
    public final Object k(Object obj) {
        switch (this.f9870r) {
            case k5.f.J:
                com.github.rudroid.utilities.ui.g1 g1Var = (com.github.rudroid.utilities.ui.g1) obj;
                k71.k.g(g1Var, "threadsState");
                return com.github.rudroid.utilities.ui.h1.h(g1Var, new k4(this.f9871s, 1));
            case 1:
                List list = (List) obj;
                k71.k.g(list, "chatThreads");
                this.f9871s.f9942v.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : list) {
                    ZonedDateTime parse = ZonedDateTime.parse(((xn.s0) obj2).c);
                    k71.k.f(parse, "parse(...)");
                    ?? withZoneSameInstant = ZonedDateTime.now().withZoneSameInstant(ZoneId.systemDefault());
                    ChronoZonedDateTime<LocalDate> withZoneSameInstant2 = parse.withZoneSameInstant(ZoneId.systemDefault());
                    l.a aVar = withZoneSameInstant2.isAfter(withZoneSameInstant.minusDays(1L)) ? l.a.f10034r : withZoneSameInstant2.isAfter(withZoneSameInstant.minusDays(2L)) ? l.a.f10035s : withZoneSameInstant2.isAfter(withZoneSameInstant.minusWeeks(1L)) ? l.a.f10036t : withZoneSameInstant2.isAfter(withZoneSameInstant.minusMonths(1L)) ? l.a.f10037u : l.a.f10038v;
                    Object obj3 = linkedHashMap.get(aVar);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap.put(aVar, obj3);
                    }
                    ((List) obj3).add(obj2);
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    arrayList.add(new com.github.rudroid.copilot.threads.n((l.a) entry.getKey(), (List) entry.getValue()));
                }
                return arrayList;
            default:
                com.github.rudroid.utilities.w0.m(this.f9871s.f9943w, (fl.b) obj);
                return w61.a0.a;
        }
    }
}
