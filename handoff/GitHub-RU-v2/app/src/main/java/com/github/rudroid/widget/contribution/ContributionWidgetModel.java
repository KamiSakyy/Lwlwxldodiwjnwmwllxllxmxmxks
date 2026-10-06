package com.github.rudroid.widget.contribution;

import com.github.rudroid.widget.WidgetUIState;
import java.util.Map;
import k81.c1;
import kotlinx.serialization.KSerializer;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class ContributionWidgetModel {
    public static final Companion Companion = new Companion();
    public static final w61.h[] c;
    public final Map a;
    public final WidgetUIState b;

    public static final class Companion {
        public final KSerializer serializer() {
            return ContributionWidgetModel$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        c = new w61.h[]{sy.w.s(iVar, new com.github.rudroid.widget.p(2)), sy.w.s(iVar, new com.github.rudroid.widget.p(3))};
    }

    public /* synthetic */ ContributionWidgetModel(int i, Map map, WidgetUIState widgetUIState) {
        if (3 != (i & 3)) {
            c1.l(i, 3, ContributionWidgetModel$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = map;
        this.b = widgetUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContributionWidgetModel)) {
            return false;
        }
        ContributionWidgetModel contributionWidgetModel = (ContributionWidgetModel) obj;
        return k71.k.b(this.a, contributionWidgetModel.a) && k71.k.b(this.b, contributionWidgetModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ContributionWidgetModel(grids=" + this.a + ", uiState=" + this.b + ")";
    }

    public ContributionWidgetModel(Map map, WidgetUIState widgetUIState) {
        k71.k.g(widgetUIState, "uiState");
        this.a = map;
        this.b = widgetUIState;
    }
}
