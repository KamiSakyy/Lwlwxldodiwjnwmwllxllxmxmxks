package l81;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: /home/user/work/p/classes5.dex */
public final class d implements SerialDescriptor {
    public static final d b = new d();
    public static final String c = "kotlinx.serialization.json.JsonArray";
    public final /* synthetic */ k81.c a;

    public d() {
        SerialDescriptor descriptor = k.a.getDescriptor();
        k71.k.g(descriptor, "elementDesc");
        this.a = new k81.c(descriptor, 1);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean c() {
        this.a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        k71.k.g(str, "name");
        return this.a.d(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final y9.a e() {
        this.a.getClass();
        return i81.k.f;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        this.a.getClass();
        return 1;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i) {
        this.a.getClass();
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        this.a.getClass();
        return x61.r.r;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean h() {
        this.a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i) {
        this.a.i(i);
        return x61.r.r;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i) {
        return this.a.j(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i) {
        this.a.k(i);
        return false;
    }
}
