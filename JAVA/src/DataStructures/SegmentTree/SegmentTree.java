package DataStructures.SegmentTree;

class SegmentTree {

    int[] tree;
    int n;

    // constructor
    SegmentTree(int[] arr) {

        n = arr.length;
        tree = new int[4 * n]; // enough space

        build(arr, 0, 0, n - 1);
    }

    // BUILD TREE
    private void build(int[] arr, int node, int start, int end) {

        // if single element
        if (start == end) {
            tree[node] = arr[start];
            return;
        }

        int mid = (start + end) / 2;

        // build left
        build(arr, 2 * node + 1, start, mid);

        // build right
        build(arr, 2 * node + 2, mid + 1, end);

        // combine result
        tree[node] = tree[2 * node + 1] + tree[2 * node + 2];
    }

    // PUBLIC FUNCTION
    public int rangeSum(int l, int r) {
        return query(0, 0, n - 1, l, r);
    }

    // QUERY FUNCTION
    private int query(int node, int start, int end, int l, int r) {

        // NO OVERLAP
        if (r < start || end < l) {
            return 0;
        }

        // COMPLETE OVERLAP
        if (l <= start && end <= r) {
            return tree[node];
        }

        int mid = (start + end) / 2;

        // PARTIAL OVERLAP
        int left = query(2 * node + 1, start, mid, l, r);
        int right = query(2 * node + 2, mid + 1, end, l, r);

        return left + right;
    }
}

// DRIVER
class SegmentDriver {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9, 11};

        SegmentTree st = new SegmentTree(arr);

        System.out.println(st.rangeSum(1, 3)); // 15
    }
}