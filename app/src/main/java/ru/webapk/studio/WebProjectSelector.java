package ru.webapk.studio;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/** Selects a web-ready output folder from a ZIP, preferring compiled SPA build directories. */
final class WebProjectSelector {
    private static final int MAX_INDEX_BYTES = 256 * 1024;

    private WebProjectSelector() { }

    static Selection select(File extractionRoot, List<String> indexPaths) throws IOException {
        if (extractionRoot == null || !extractionRoot.isDirectory()) {
            throw new IOException("Не найдена распакованная папка сайта.");
        }
        if (indexPaths == null || indexPaths.isEmpty()) {
            throw new IOException("В ZIP не найден index.html.");
        }

        List<Candidate> builtOutputs = new ArrayList<>();
        for (String path : indexPaths) {
            int rank = buildOutputRank(path);
            if (rank >= 0) builtOutputs.add(new Candidate(path, rank, path.split("/").length));
        }
        Collections.sort(builtOutputs, new Comparator<Candidate>() {
            @Override public int compare(Candidate left, Candidate right) {
                int rank = Integer.compare(left.rank, right.rank);
                return rank != 0 ? rank : Integer.compare(left.depth, right.depth);
            }
        });

        String selectedIndex;
        boolean builtOutput = !builtOutputs.isEmpty();
        if (builtOutput) {
            Candidate best = builtOutputs.get(0);
            if (builtOutputs.size() > 1) {
                Candidate next = builtOutputs.get(1);
                if (best.rank == next.rank && best.depth == next.depth) {
                    throw new IOException("В ZIP несколько готовых web build-папок. Оставьте одну dist/ или build/.");
                }
            }
            selectedIndex = best.path;
        } else if (indexPaths.contains("index.html")) {
            selectedIndex = "index.html";
        } else if (indexPaths.size() == 1) {
            selectedIndex = indexPaths.get(0);
        } else {
            throw new IOException("В ZIP несколько index.html и не найдена папка dist/ или build/. Упакуйте готовую сборку отдельно.");
        }

        File selectedFile = new File(extractionRoot, selectedIndex);
        String rootPath = extractionRoot.getCanonicalPath();
        String selectedPath = selectedFile.getCanonicalPath();
        if (!selectedPath.startsWith(rootPath + File.separator) || !selectedFile.isFile()) {
            throw new IOException("Стартовый HTML находится вне папки проекта или не является файлом.");
        }
        if (!builtOutput && looksLikeUnbuiltFrontend(extractionRoot, selectedFile)) {
            throw new IOException("Обнаружен исходный React/Vite-проект, но в ZIP нет готовой dist/ или build/ сборки. "
                    + "Конвертер работает офлайн и не запускает npm install/npm run build. "
                    + "Соберите проект Node.js-командой npm ci && npm run build, затем импортируйте ZIP с dist/ "
                    + "(или build/) и всеми ресурсами. Одного package-lock.json для сборки недостаточно.");
        }

        File siteRoot = selectedFile.getParentFile();
        File normalizedIndex = new File(siteRoot, "index.html");
        if (!selectedFile.equals(normalizedIndex)) {
            if (normalizedIndex.exists() || !selectedFile.renameTo(normalizedIndex)) {
                throw new IOException("Не удалось привести имя стартового файла к index.html.");
            }
        }
        String kind = builtOutput ? outputLabel(selectedIndex) : "сайт";
        return new Selection(siteRoot, selectedIndex, kind);
    }

    private static int buildOutputRank(String path) {
        String[] parts = path.replace('\\', '/').split("/");
        if (parts.length < 2 || !"index.html".equalsIgnoreCase(parts[parts.length - 1])) return -1;
        for (int i = 0; i < parts.length - 1; i++) {
            String part = parts[i].toLowerCase(Locale.ROOT);
            if ("dist".equals(part)) return 0;
            if ("build".equals(part)) return 1;
            if ("out".equals(part)) return 2;
            if ("www".equals(part)) return 3;
            if ("_site".equals(part) || "public-build".equals(part)) return 4;
            if (".output".equals(part) && i + 1 < parts.length - 1
                    && "public".equalsIgnoreCase(parts[i + 1])) return 5;
        }
        return -1;
    }

    private static boolean looksLikeUnbuiltFrontend(File extractionRoot, File indexFile) throws IOException {
        String html = readText(indexFile, MAX_INDEX_BYTES).toLowerCase(Locale.ROOT);
        boolean referencesSourceModule = html.contains("src/main.tsx") || html.contains("src/main.jsx")
                || html.contains("src/main.ts") || html.contains("src/main.js");
        File current = indexFile.getParentFile();
        String rootPath = extractionRoot.getCanonicalPath();
        while (current != null && current.getCanonicalPath().startsWith(rootPath)) {
            boolean hasPackage = new File(current, "package.json").isFile();
            if (hasPackage) {
                if (referencesSourceModule || new File(current, "src/main.tsx").isFile()
                        || new File(current, "src/main.jsx").isFile()
                        || new File(current, "src/main.ts").isFile()
                        || new File(current, "src/main.js").isFile()
                        || new File(current, "src/index.tsx").isFile()
                        || new File(current, "src/index.jsx").isFile()
                        || new File(current, "src/index.ts").isFile()
                        || new File(current, "src/index.js").isFile()) return true;
            }
            if (current.equals(extractionRoot)) break;
            current = current.getParentFile();
        }
        return false;
    }

    private static String readText(File file, int limit) throws IOException {
        try (InputStream input = new FileInputStream(file);
             ByteArrayOutputStream output = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[8192];
            int read;
            int total = 0;
            while (total < limit && (read = input.read(buffer)) != -1) {
                int accepted = Math.min(read, limit - total);
                output.write(buffer, 0, accepted);
                total += accepted;
            }
            return new String(output.toByteArray(), StandardCharsets.UTF_8);
        }
    }

    private static String outputLabel(String indexPath) {
        String[] parts = indexPath.split("/");
        for (int i = 0; i < parts.length - 1; i++) {
            String part = parts[i];
            if ("dist".equalsIgnoreCase(part) || "build".equalsIgnoreCase(part)
                    || "out".equalsIgnoreCase(part) || "www".equalsIgnoreCase(part)
                    || "_site".equalsIgnoreCase(part) || "public-build".equalsIgnoreCase(part)) {
                return part;
            }
        }
        return "web build";
    }

    static final class Selection {
        final File siteRoot;
        final String selectedIndex;
        final String outputLabel;

        private Selection(File siteRoot, String selectedIndex, String outputLabel) {
            this.siteRoot = siteRoot;
            this.selectedIndex = selectedIndex;
            this.outputLabel = outputLabel;
        }
    }

    private static final class Candidate {
        final String path;
        final int rank;
        final int depth;

        Candidate(String path, int rank, int depth) {
            this.path = path;
            this.rank = rank;
            this.depth = depth;
        }
    }
}
