import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {
        // Split the path by one or more slashes
        String[] components = path.split("/");
        Stack<String> stack = new Stack<>();
        
        for (String component : components) {
            // If it's empty or a single dot, skip it
            if (component.isEmpty() || component.equals(".")) {
                continue;
            }
            // If it's a double dot, go back to the parent directory by popping
            if (component.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // Otherwise, it's a valid directory or file name
                stack.push(component);
            }
        }
        
        // Rebuild the simplified canonical path
        StringBuilder canonicalPath = new StringBuilder();
        for (String dir : stack) {
            canonicalPath.append("/").append(dir);
        }
        
        // If the stack was empty, return the root directory "/"
        return canonicalPath.length() == 0 ? "/" : canonicalPath.toString();
    }
}
