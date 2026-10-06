package h91;

import c30.o0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* loaded from: /home/user/work/p/classes5.dex */
public final class xShadow extends w {
    public static Long i0(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (millis != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // h91.w, h91.o
    public final g4.f N(a0 a0Var) {
        a0 a0Var2;
        k71.k.g(a0Var, "path");
        Path f = a0Var.f();
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(f, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path readSymbolicLink = readAttributes.isSymbolicLink() ? Files.readSymbolicLink(f) : null;
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (readSymbolicLink != null) {
                String str = a0.s;
                a0Var2 = o0.b(readSymbolicLink.toString(), false);
            } else {
                a0Var2 = null;
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            Long i0 = creationTime != null ? i0(creationTime) : null;
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            Long i02 = lastModifiedTime != null ? i0(lastModifiedTime) : null;
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            return new g4.f(isRegularFile, isDirectory, a0Var2, valueOf, i0, i02, lastAccessTime != null ? i0(lastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // h91.w, h91.o
    public final void m(a0 a0Var, a0 a0Var2) {
        k71.k.g(a0Var, "source");
        k71.k.g(a0Var2, "target");
        try {
            Files.move(a0Var.f(), a0Var2.f(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // h91.w
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
