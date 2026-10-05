package com.github.rudroid.utilities;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b2 extends l7.p1 {
    public final /* synthetic */ RecyclerView w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(RecyclerView recyclerView) {
        super(recyclerView);
        this.w = recyclerView;
    }

    public final void d(View view, b5.f fVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.a;
        k71.k.g(view, "host");
        super.d(view, fVar);
        l7.m0 adapter = this.w.getAdapter();
        int k = adapter != null ? adapter.k() : 0;
        AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
        b5.e eVar = collectionInfo != null ? new b5.e(0, collectionInfo) : null;
        boolean isHierarchical = eVar != null ? ((AccessibilityNodeInfo.CollectionInfo) eVar.b).isHierarchical() : false;
        AccessibilityNodeInfo.CollectionInfo collectionInfo2 = accessibilityNodeInfo.getCollectionInfo();
        b5.e eVar2 = collectionInfo2 != null ? new b5.e(0, collectionInfo2) : null;
        fVar.k(b5.e.c(k, 1, eVar2 != null ? ((AccessibilityNodeInfo.CollectionInfo) eVar2.b).getSelectionMode() : 0, isHierarchical));
    }

    public final a5.b j() {
        return new a2(this);
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class RecyclerView<T1,T2,T3,T4> {
        public RecyclerView() {
        }
    }
}
