package com.github.rudroid.agents.sessionevents;

import com.github.rudroid.agents.sessionevents.r;
import com.github.service.copilot.SessionEventType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;

/* loaded from: /home/user/work/p/classes.dex */
public final class z {

    public static final /* synthetic */ class a {
        static {
            int[] iArr = new int[xn.j3.values().length];
            try {
                iArr[15] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SessionEventType.Companion companion = xn.j3.Companion;
                iArr[20] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                SessionEventType.Companion companion2 = xn.j3.Companion;
                iArr[32] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                SessionEventType.Companion companion3 = xn.j3.Companion;
                iArr[34] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                SessionEventType.Companion companion4 = xn.j3.Companion;
                iArr[36] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                SessionEventType.Companion companion5 = xn.j3.Companion;
                iArr[22] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ArrayList arrayList, LinkedHashMap linkedHashMap, ArrayList arrayList2) {
        x61.r arrayList3;
        Integer num;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            xn.i3 i3Var = (xn.i3) obj;
            xn.j3 j3Var = i3Var.e;
            String str = i3Var.i;
            int ordinal = j3Var.ordinal();
            if (ordinal == 20) {
                if (str == null) {
                    str = i3Var.a;
                }
                String str2 = str;
                String str3 = i3Var.g;
                if (str3 == null) {
                    str3 = "unknown";
                }
                s4 s4Var = new s4(str2, str3, i3Var, null, (String) linkedHashMap.get(str2));
                linkedHashMap2.put(str2, Integer.valueOf(arrayList4.size()));
                arrayList4.add(s4Var);
            } else if (ordinal == 22 && str != null && (num = (Integer) linkedHashMap2.get(str)) != null) {
                int intValue = num.intValue();
                s4 s4Var2 = (s4) arrayList4.get(num.intValue());
                String str4 = s4Var2.f7821a;
                String str5 = s4Var2.f7822b;
                xn.i3 i3Var2 = s4Var2.f7823c;
                String str6 = s4Var2.f7825e;
                k71.k.g(str4, "id");
                arrayList4.set(intValue, new s4(str4, str5, i3Var2, i3Var, str6));
            }
        }
        if (!arrayList4.isEmpty()) {
            if (arrayList4.isEmpty()) {
                arrayList3 = x61.r.r;
            } else {
                arrayList3 = new ArrayList();
                ArrayList q10 = sy.d0.q(new s4[]{x61.m.U(arrayList4)});
                int size2 = arrayList4.size();
                for (int i10 = 1; i10 < size2; i10++) {
                    if (((s4) arrayList4.get(i10)).f7822b.equals(((s4) x61.m.e0(q10)).f7822b)) {
                        q10.add(arrayList4.get(i10));
                    } else {
                        arrayList3.add(q10);
                        q10 = sy.d0.q(new s4[]{arrayList4.get(i10)});
                    }
                }
                arrayList3.add(q10);
            }
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList2.add(new r.e((List) it.next()));
            }
        }
        arrayList.clear();
    }

    public static boolean b(ArrayList arrayList, String str, sy.s sVar, xn.i3 i3Var) {
        int i;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            }
            r rVar = (r) listIterator.previous();
            if (rVar instanceof r.a) {
                sy.s sVar2 = ((r.a) rVar).f7794a.p;
                if (k71.k.b(sVar2 != null ? sVar2.j() : null, str)) {
                    i = listIterator.nextIndex();
                    break;
                }
            }
        }
        boolean z10 = false;
        if (i < 0) {
            return false;
        }
        Object obj = arrayList.get(i);
        k71.k.e(obj, "null cannot be cast to non-null type com.github.rudroid.agents.sessionevents.ProcessedEvent.InteractivePrompt");
        xn.i3 i3Var2 = ((r.a) obj).f7794a;
        Object obj2 = a0.f7341a;
        if (i3Var2.e == xn.j3.C) {
            long abs = Math.abs(i3Var.b.toEpochMilli() - i3Var2.b.toEpochMilli());
            if (0 <= abs && abs < 501) {
                z10 = true;
            }
        }
        arrayList.set(i, new r.a(i3Var2, true, sVar, z10));
        return true;
    }
}
