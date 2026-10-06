package com.github.rudroid.utilities;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;

/* loaded from: /home/user/work/p/classes3.dex */
public class b {
    public static final a Companion = new a();
    public AccessibilityManager a;

    public static final class a {
        public static boolean a(Context context) {
            k71.k.g(context, "context");
            Object systemService = context.getApplicationContext().getSystemService("accessibility");
            k71.k.e(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
            return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
        }

        public static void b(View view, SparseArray sparseArray) {
            k71.k.g(view, "view");
            a5.c1.p(view, new com.github.rudroid.utilities.a(sparseArray));
        }

        public static void c(View view, int i) {
            k71.k.g(view, "view");
            SparseArray sparseArray = new SparseArray();
            sparseArray.put(16, view.getContext().getString(i));
            b(view, sparseArray);
        }
    }

    public b(Context context) {
        k71.k.g(context, "context");
        Companion.getClass();
        Object systemService = context.getApplicationContext().getSystemService("accessibility");
        k71.k.e(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.a = (AccessibilityManager) systemService;
    }

    public final void a(Context context, int i, int i2, j71.a aVar) {
        k71.k.g(context, "context");
        AccessibilityManager accessibilityManager = this.a;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int intValue = ((Number) aVar.a()).intValue();
            if (intValue < 0) {
                intValue = 0;
            }
            b(context.getString(2131953824, Integer.valueOf((i - intValue) + 1), Integer.valueOf(i2)));
        }
    }

    public final void b(String str) {
        AccessibilityManager accessibilityManager = this.a;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
            obtain.setContentDescription(str);
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }
}
