private static int getHeight(Node root) {

    if (root == null){
        return -1;
    }
    int height = Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    return height;
}
