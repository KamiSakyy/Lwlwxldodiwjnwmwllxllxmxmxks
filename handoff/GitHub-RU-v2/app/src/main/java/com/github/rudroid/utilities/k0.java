package com.github.rudroid.utilities;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k0 extends HorizontalScrollView {
    public static final a Companion = new a();
    public j71.c r;
    public RecyclerView s;

    public static final class a {
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        RecyclerView recyclerView = this.s;
        if (motionEvent == null || recyclerView == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        View F = recyclerView.F(motionEvent.getX(), motionEvent.getY());
        ViewGroup viewGroup = F instanceof ViewGroup ? (ViewGroup) F : null;
        if ((viewGroup != null ? viewGroup.findViewWithTag("pannable") : null) == null) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 2 || motionEvent.getAction() == 0) {
            j71.c cVar = this.r;
            if (cVar != null) {
                cVar.k(1);
            }
        } else {
            j71.c cVar2 = this.r;
            if (cVar2 != null) {
                cVar2.k(2);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setHostedRecyclerView(RecyclerView recyclerView) {
        k71.k.g(recyclerView, "recyclerView");
        this.s = recyclerView;
    }

    public final void setScrollStateCallback(j71.c cVar) {
        this.r = cVar;
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class RecyclerView {
        public RecyclerView() {
        }
    }
}
