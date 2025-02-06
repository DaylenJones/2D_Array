public class Array {
    def calculate_sums(Array):
    row_sums =[

    sum(row) for
    row in
    Array]
    column_sums =[

    sum(Array[i][j]for i in range(len(array)))for
    j in

    range(len(Array[0]))]
            return row_sums,column_sums

    Array =[
            [1,2,3]
            [4,5,6]
            [7,8,9]
            ]

    row_sums,column_sums =

    calculate_sums(Array)

    print("Row Sums:",row_sums)

    print("Column Sums:",column_sums)
}