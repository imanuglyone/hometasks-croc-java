import java.util.Stack;

public class FifthTaskPathNormalizer {
    /**
     * Javadoc.
     * a function that performs "normalization" of a given path,
     * that is, removing unnecessary directories from it,
     * taking into account the transitions "." and "..".
     * @author Popov Danil
     * @version 2.4
     */
    public static String normalizePath(String path) {
        // Dividing the path into directories by the separator "/"
        String[] directories = path.split("/");
        Stack<String> stack = new Stack<>();

        for (String dir : directories) {
            if (dir.equals("..")) {
                // If the current directory is "..", delete the last element from the stack
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!dir.equals(".") && !dir.isEmpty()) {
                // If the current directory is not "." and is not empty, add it to the stack
                stack.push(dir);
            }
        }

        // Collecting the path from the stack elements
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
            result.insert(0, "/");
        }

        // If the original path was absolute, add "/" to the beginning
        if (path.startsWith("/")) {
            result.insert(0, "/");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String path = "КРОК/task_5_2/src/./../../task_5_1/../../../мемы/котики";
        String normalizedPath = normalizePath(path);
        System.out.println(normalizedPath);
    }
}
