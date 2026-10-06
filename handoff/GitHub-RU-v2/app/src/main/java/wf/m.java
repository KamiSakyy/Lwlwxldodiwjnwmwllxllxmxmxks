package wf;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ic.k9;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m extends com.github.rudroid.adapters.viewholders.e<k5.f> {
    public s v;
    public j w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k9 k9Var, s sVar) {
        super(k9Var);
        k71.k.g(sVar, "callback");
        this.v = sVar;
        j jVar = new j(sVar);
        this.w = jVar;
        RecyclerView recyclerView = k9Var.N;
        ((k5.f) k9Var).A.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager());
        recyclerView.setAdapter(jVar);
    }
}
