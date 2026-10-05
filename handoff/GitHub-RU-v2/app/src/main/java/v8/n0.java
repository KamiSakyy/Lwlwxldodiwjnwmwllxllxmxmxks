package v8;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f32824a;

    /* renamed from: b, reason: collision with root package name */
    public final d9.q f32825b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f32826c;

    public n0(UUID uuid, d9.q qVar, LinkedHashSet linkedHashSet) {
        k71.k.g(uuid, "id");
        k71.k.g(qVar, "workSpec");
        k71.k.g(linkedHashSet, "tags");
        this.f32824a = uuid;
        this.f32825b = qVar;
        this.f32826c = linkedHashSet;
    }
}
