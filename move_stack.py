def move_disk(from_peg, to_peg):
    print(from_peg, '->', to_peg)

def move_stack(num_disks, from_peg, to_peg):
    if num_disks == 1:
        move_disk(from_peg, to_peg)
    else:
        other_peg = 6 - (from_peg + to_peg)
        move_stack(num_disks - 1, from_peg, other_peg)
        move_disk(from_peg, to_peg)
        move_stack(num_disks - 1, other_peg, to_peg)
        
        
