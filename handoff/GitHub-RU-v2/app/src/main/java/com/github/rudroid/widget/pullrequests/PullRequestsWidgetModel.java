package com.github.rudroid.widget.pullrequests;

import com.github.rudroid.widget.WidgetUIState;
import java.util.Map;
import k81.c1;
import kotlinx.serialization.KSerializer;
import sy.w;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class PullRequestsWidgetModel {
    public static final Companion Companion = new Companion();
    public static final w61.h[] c;
    public final Map a;
    public final WidgetUIState b;

    public static final class Companion {
        public final KSerializer serializer() {
            return PullRequestsWidgetModel$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        c = new w61.h[]{w.s(iVar, new com.github.rudroid.widget.p(4)), w.s(iVar, new com.github.rudroid.widget.p(5))};
    }

    public /* synthetic */ PullRequestsWidgetModel(int i, Map map, WidgetUIState widgetUIState) {
        if (2 != (i & 2)) {
            c1.l(i, 2, PullRequestsWidgetModel$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = map;
        }
        this.b = widgetUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PullRequestsWidgetModel)) {
            return false;
        }
        PullRequestsWidgetModel pullRequestsWidgetModel = (PullRequestsWidgetModel) obj;
        return k71.k.b(this.a, pullRequestsWidgetModel.a) && k71.k.b(this.b, pullRequestsWidgetModel.b);
    }

    public final int hashCode() {
        Map map = this.a;
        return this.b.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
    }

    public final String toString() {
        return "PullRequestsWidgetModel(accountNameToPullsData=" + this.a + ", uiState=" + this.b + ")";
    }

    public PullRequestsWidgetModel(Map map, WidgetUIState widgetUIState) {
        k71.k.g(widgetUIState, "uiState");
        this.a = map;
        this.b = widgetUIState;
    }
}
