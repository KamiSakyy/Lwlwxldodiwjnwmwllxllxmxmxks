package com.github.rudroid.agents.sessionevents;

import android.content.Context;
import com.github.rudroid.agents.sessionevents.l;
import com.github.service.copilot.ElicitationAction;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes.dex */
public final class m {

    public static final /* synthetic */ class a {
        static {
            int[] iArr = new int[xn.g1.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ElicitationAction.Companion companion = xn.g1.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ElicitationAction.Companion companion2 = xn.g1.Companion;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final String a(l lVar, Context context) {
        k71.k.g(lVar, "<this>");
        k71.k.g(context, "context");
        if (lVar instanceof l.i) {
            return ((l.i) lVar).f7709b;
        }
        if (lVar instanceof l.h) {
            String string = context.getString(2131951764);
            k71.k.f(string, "getString(...)");
            return string;
        }
        if (lVar instanceof l.d) {
            String string2 = context.getString(2131951743);
            k71.k.f(string2, "getString(...)");
            return string2;
        }
        if (lVar instanceof l.e) {
            String str = ((l.e) lVar).f7699d;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1369693651:
                        if (str.equals("exit_only")) {
                            String string3 = context.getString(2131951742);
                            k71.k.f(string3, "getString(...)");
                            return string3;
                        }
                        break;
                    case 1037315064:
                        if (str.equals("autopilot_fleet")) {
                            String string4 = context.getString(2131951740);
                            k71.k.f(string4, "getString(...)");
                            return string4;
                        }
                        break;
                    case 1676672617:
                        if (str.equals("autopilot")) {
                            String string5 = context.getString(2131951741);
                            k71.k.f(string5, "getString(...)");
                            return string5;
                        }
                        break;
                    case 1844104930:
                        if (str.equals("interactive")) {
                            String string6 = context.getString(2131951744);
                            k71.k.f(string6, "getString(...)");
                            return string6;
                        }
                        break;
                }
            }
            if (str != null) {
                return str;
            }
            String string7 = context.getString(2131954481);
            k71.k.f(string7, "getString(...)");
            return string7;
        }
        if (lVar instanceof l.b) {
            l.b bVar = (l.b) lVar;
            if (!bVar.f7692b) {
                String string8 = context.getString(2131954478);
                k71.k.f(string8, "getString(...)");
                return string8;
            }
            if (bVar.f7693c == xn.z2.t) {
                String string9 = context.getString(2131954475);
                k71.k.f(string9, "getString(...)");
                return string9;
            }
            String string10 = context.getString(2131954474);
            k71.k.f(string10, "getString(...)");
            return string10;
        }
        if (lVar instanceof l.f) {
            String string11 = context.getString(((l.f) lVar).f7704c ? 2131951741 : 2131951742);
            k71.k.f(string11, "getString(...)");
            return string11;
        }
        if (!(lVar instanceof l.a)) {
            throw new NoWhenBranchMatchedException();
        }
        int ordinal = ((l.a) lVar).f7689b.ordinal();
        if (ordinal == 0) {
            String string12 = context.getString(2131954372);
            k71.k.f(string12, "getString(...)");
            return string12;
        }
        if (ordinal == 1) {
            String string13 = context.getString(2131954361);
            k71.k.f(string13, "getString(...)");
            return string13;
        }
        if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String string14 = context.getString(2131954358);
        k71.k.f(string14, "getString(...)");
        return string14;
    }
}
